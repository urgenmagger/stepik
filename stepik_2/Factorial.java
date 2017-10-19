package stepik_2;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        BigInteger result = factorial(8);
        System.out.println(result);
    }


    public static BigInteger factorial(int value) {
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }
}
