public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("get month name " + getMonthV2(2));
    }

    public static String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            default:
                return "2024";
        }
    }

    public static String getMonthV2(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> { yield "Feb"; }
            default -> "2024";
        };
    }
}
