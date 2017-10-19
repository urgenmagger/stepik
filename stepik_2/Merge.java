package stepik_2;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4};
        int a2[] = {1, 5, 7, 9};
        int a3[] = mergeArrays(a1, a2);
        System.out.println(Arrays.toString(a3));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int result[] = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {//both arrays
            if (a1[i] < a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }
        while (i < a1.length) { //only one array
            result[k++] = a1[i++];
        }
        while (j < a2.length) {
            result[k++] = a2[j++];
        }
        return result;
    }
}
