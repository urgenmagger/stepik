package stepic_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Palindrome {
    public static void main(String[] args) {
        String input = "Madam";
        String lower = input.toLowerCase();
        Pattern pattern = Pattern.compile("[^a-z-0-9]");
        Matcher matcher = pattern.matcher(lower);
        String result = matcher.replaceAll("");
        System.out.println(result);
        StringBuffer output = new StringBuffer(result);
        output.reverse();
        if (result.toString().equals(output.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
