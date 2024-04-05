public class KeywordsExpressions {
    public static void main(String[] args) {
        double highScore = 80; // this is statement
        //highScore = 80 //this is expression

        if(highScore > 80 && highScore < 100) { //conditions inside if is exp
            highScore += 100; // this is also expression
        }

        highScore++; //this is a statement

        //create method
        printMessage();

        //method with argument, void return
        printMessage("Welcome to Mexico");

        //method with return type
        int highScores = calculateHighScore(200);
        System.out.println("The score is " + highScores);
    }

    public static void printMessage() {
        System.out.println("Welcome to Methods");
    }

    public static void printMessage(String str) {
        System.out.println("This is method with arg " + str);
    }

    public static int calculateHighScore(int number) {
        return number * 100;
    }
}
