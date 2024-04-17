package learn;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        Object objList[] = new Object[3];
        System.out.println(Arrays.toString(objList));

        objList[0] = new String[]{"Hello", "World"};
        System.out.println(Arrays.deepToString(objList));

        objList[1] = new String[][]{
                {"Hello", "World"},
                {"Welcome", "Java"},
                {"16", "04", "2024"}
        };
        System.out.println(Arrays.deepToString(objList));
        objList[2] = new int[][]{
                {1,2,3,4,5},
                {11,12,13},
                {21,22,34,45,67,78,89,90}
        };
        System.out.println(Arrays.deepToString(objList));

        for(Object element: objList) {
            System.out.println("Element " + Arrays.deepToString((Object[]) element));
        }
    }
}
