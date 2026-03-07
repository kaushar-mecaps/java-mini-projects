public class Player {

    // instance variable
    String playerName;
    int score;

    // static variable
    static int totalPlayers = 0;

    // Constructor har new player ke sath totalPlayer++.
    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;

        totalPlayers++; // player counter.
    }

    public void showScore() {
        System.out.println(
                " Player " + playerName +
                        " \n Score is = " + score );

        System.out.println("--------------------------------------");
    }
}
