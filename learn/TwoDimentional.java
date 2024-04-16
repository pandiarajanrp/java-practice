package learn;

import java.util.Arrays;

public class TwoDimentional {
    public static void main(String[] args) {
        int[] singEl = new int[4];
        int[][] twoDel = new int[3][3];
        System.out.println(Arrays.toString(singEl));

        System.out.println(Arrays.toString(twoDel));

        System.out.println(Arrays.deepToString(twoDel));


        //loop array items
        for(int[] outer: twoDel) {
            System.out.println(Arrays.toString(outer));
            for(int inner: outer) {
                System.out.println(inner);
            }
        }
    }
}
