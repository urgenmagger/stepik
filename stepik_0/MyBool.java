package stepik_0;

public class MyBool {
    public static void main(String[] args) {

        boolean fftt = booleanExpression(false, false, true, true);
        boolean ttff = booleanExpression(true, true, false, false);
        System.out.println(fftt);
        System.out.println(ttff);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a & b & (!c) & (!d) ||
                (!a) & (!b) & c & d));
    }
}
