public class Code {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score was = " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, 10000, 8, 100);
        System.out.println("your final score was = " + highScore);

        int highestScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Luis", highestScorePosition);


        highestScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Amador", highestScorePosition);


        highestScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Gonzalez", highestScorePosition);


        highestScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jose", highestScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the highscore");
    }

    public static int calculateHighScorePosition(int playerScores) {
        if (playerScores >= 1000) {
            return 1;
        } else if (playerScores >= 500 && playerScores < 1000) {
            return 2;
        } else if (playerScores >= 100 && playerScores < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score was = " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
