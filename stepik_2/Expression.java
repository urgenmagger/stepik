package stepic_2;

public class Expression {
    public static void main(String[] args) {
        char symbol = charExpression(29);
        System.out.println(symbol);
    }


    public static char charExpression(int a) {
        int result = ('\\' + a);
        return (char) result;
    }

}
