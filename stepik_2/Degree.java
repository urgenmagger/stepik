package stepik_2;

public class Degree {
    public static void main(String[] args) {
        Boolean result = isPowerOfTwo(10);
        System.out.println(result);

    }
    public static boolean isPowerOfTwo(int value) {
        boolean result;
        if ((Math.abs(value) & ((Math.abs(value) - 1))) == 0 && value != 0){
            result = true;
        } else {
            result = false;
        }
        return result;// you implementation here
    }
}
