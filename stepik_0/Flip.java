package stepik_0;

public class Flip { public static void main(String[] args) {
        int flip = flipBit(7,3);
        System.out.println(flip);

    }
    public static int flipBit(int value, int bitIndex) {
        int result = (1 << bitIndex - 1);// put your implementation here
        return value ^ result;
    }
    //value - 101, 100
    //1101  - 1001
}
