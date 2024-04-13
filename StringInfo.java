public class StringInfo {
    public static void main(String[] args) {
       String str = "Hello World";

       stringInspectionMethods(str);
       stringComparisionMethods(str);
       stringManipulationMethod(str);
    }

    public static void stringInspectionMethods(String str) {
        System.out.println("Length " + str.length());
        System.out.println("Char at 0 " + str.charAt(0));
        System.out.println("Index of at 0 " + str.indexOf('W'));
    }

    public static void stringComparisionMethods(String str) {
        System.out.println("Start with " + str.startsWith("Hello"));
        System.out.println("Ends with " + str.startsWith("World"));
    }

    public static void stringManipulationMethod(String str) {
        System.out.println("lower case " + str.toLowerCase());
        System.out.println("upper case " + str.toUpperCase());
    }
}
