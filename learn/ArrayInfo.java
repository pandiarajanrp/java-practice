package learn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayInfo {
    public static void main(String[] args) {
        //create new array
        int[] arrayElments = new int[10];
        arrayElments[0] = 12;
        arrayElments[5] = 24;
        arrayElments[9] = 48;
        //arrayElements[10] = 50; //throws error

        //create array without length;
        int[] firstFiveEl;
        firstFiveEl = new int[] {1, 2};
        firstFiveEl[1] = 6;
        System.out.println("Last item " + firstFiveEl[1]);

        //create array with value
        int[] firstSixEl = {1,2,3,4,5,6};
        firstSixEl[5] = 25;
        System.out.println("Array el length " + firstSixEl.length);
        System.out.println("Last item " + firstSixEl[5]);

        //default value
        int[] defaultEl;
        defaultEl = new int[6];
        for(int i = 0; i< defaultEl.length; i++) {
            System.out.print(defaultEl[i]); // 0
        }
        System.out.println("Enhanced For");
        for(int el : defaultEl) {
            System.out.print(el);
        }
        //Arrays class static methods
        System.out.println(Arrays.toString(defaultEl));
    }
}
