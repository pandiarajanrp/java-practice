public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("get month name " + getMonthV2(2));
        double step = 0.25;
        double amount = 15000.0;
        for (double init = 1; init < 10; init += 0.25) {
            if (init > 9.5) {
                break;
            }
            // System.out.println("Interest for amount " + amount + " with rate " + init + " = " + calculateInterest(amount, init));
        }

        //while
        int j = 1;
        while (j <= 10) {
            if (j == 9) {
                break;
            }

            if (j == 7) {
                j++;
                continue;
            }

            System.out.println("Loop item "+ j);
            j++;
        }

        //do while
        int k = 11;
        do {
            System.out.println("Do Loop item "+ k);
            k++;
        } while (k <= 10);
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

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }
}
