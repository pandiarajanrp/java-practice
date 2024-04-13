class Player {
    private String name;
    private int healthPercentage;
    private int score;

    private void setScoreInfo(int score) {
        if (score > 100) {
            this.score = 100;
        } else if(score < 0) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    public Player(String name, int healthPercentage, int score) {
        this.name = name;
        this.setScoreInfo(score);
        this.healthPercentage = healthPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.setScoreInfo(score);
    }

    public void weightLoss(int healthPercentage) {
        this.healthPercentage -= healthPercentage;
    }

    public void healthGain(int healthGain) {
        this.healthPercentage += healthGain;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }
}
public class Encaptulation {
    public static void main(String[] args) {
        Player player = new Player("Pandi", 20, 80);

        player.weightLoss(8);
        System.out.println("Health Percent " + player.getHealthPercentage());

        player.healthGain(25);
        System.out.println("Health Percent " + player.getHealthPercentage());
    }
}
