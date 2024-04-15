package learn;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] randomEl = new int[]{34,56,78,45,12,23,18,56,98,76};
        System.out.println("Array El " + Arrays.toString(randomEl));
        Arrays.sort(randomEl);
        System.out.println("Sorted: " + Arrays.toString(randomEl));
    }
}
