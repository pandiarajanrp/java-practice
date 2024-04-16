package learn;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int diffArr[] = new int[10];
        diffArr[0] = 45;
        System.out.println("Diff " + diffArr[0]);

        int[] randomEl = new int[]{34,56,78,45,12,23,18,56,98,76};
        System.out.println("Array El " + Arrays.toString(randomEl));
        Arrays.sort(randomEl);
        System.out.println("Sorted: " + Arrays.toString(randomEl));

        int[] serialEl = new int[10];
        Arrays.fill(serialEl, 5);
        System.out.println("Serial Array " + Arrays.toString(serialEl));

        //copy array
        int[] thirdEl = Arrays.copyOf(serialEl, 6);
        System.out.println("Copy " + Arrays.toString(thirdEl));

        //binary search
        String[] strEl = {"Jon", "Smith", "Mat", "Abi", "Test"};
        Arrays.sort(strEl);
        int pos = Arrays.binarySearch(strEl, "Abi");
        System.out.println("Abi pos in Arr " + pos);
    }
}
