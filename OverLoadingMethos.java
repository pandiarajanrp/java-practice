public class OverLoadingMethos {
    public static void main(String[] args) {
        //method overloading
        printUserInfo("Pandiarajan Rajagopal");
        printUserInfo("Pandiarajan Rajagopal", 32);
        printUserInfo("Pandiarajan Rajagopal", 32, 55000.50f);
        printUserInfo("Pandiarajan Rajagopal", 32, 2500.45d);

        //convert to centimeters
        float inchTocms = convertToCentimeters(14);
        float feetTocms = convertToCentimeters(2.5f, 8);
        System.out.println("Inch to CM " + inchTocms);
        System.out.println("Feet to CM " + feetTocms);
    }

    public static void printUserInfo(String name) {
        System.out.println("The Person name is " + name);
    }

    public static void printUserInfo(String name, int age) {
        System.out.println("The Person name is " + name + " and age " + age);
    }

    public static void printUserInfo(String name, int age, float salary) {
        System.out.println("The Person name is " + name + " and age " + age + " getting salary of " + salary);
    }

    public static void printUserInfo(String name, int age, double tax) {
        System.out.println("The Person name is " + name + " and age " + age + " paying tax of " + tax);
    }

    public static float convertToCentimeters(float inches) {
        return inches * 2.54f;
    }

    public static float convertToCentimeters(float feet, float inches) {
        return ((feet * 12) + inches) * 2.54f;
    }
}
