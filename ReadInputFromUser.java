import java.util.Scanner;

public class ReadInputFromUser {
    public static void main(String[] args) {
        int currentYear = 2024;
        //System.out.println(getInputFromConsole(currentYear));
        getInputFromScanner(currentYear);
    }

    public static String getInputFromConsole(int currentYear) {
        try {
            String name = System.console().readLine("Enter your name: ");
            System.out.println("Hi " + name + " Welcome ::");
            String birthYear = System.console().readLine("Enter your year of Birth");
            int age = currentYear - Integer.parseInt(birthYear);
            return "Hi " + name + " You are " + age + " Years old";
        } catch (Exception e) {
            System.out.println("Error :::" + e.getMessage());
        }
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " Welcome ");
        System.out.println("Whats your year of birth");
        String age = scanner.nextLine();
        System.out.println("Hi " + name + " you are " + (currentYear - Integer.parseInt(age)) + " years old");
        return "";
    }
}
