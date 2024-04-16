package learn;

public class Varargs {
    public static void main(String... args) {
        String[] str = {"first", "second", "third", "fourth", "fifth"};
        printString(str);

        String strl = "Hello";
        printString(strl);

        printString(strl, "World", "Welcome", "Java");
    }

    public static void printString(String... textList) {
        System.out.println("------------");
        System.out.println(String.join("@", textList));
        System.out.println("************");
    }
}
