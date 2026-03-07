//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create multiple player object.
        Player player = new Player("Kaushar Ali",80);
        Player player1 = new Player("Afzal Ali",80);
        Player player2 = new Player("Rehan Ali",80);
        Player player3 = new Player("Ahsan Ali",80);
        Player player4 = new Player("Sahil Ali",80);

        // Showing individual player score.
        player.showScore();
        player1.showScore();
        player2.showScore();
        player3.showScore();

        System.out.println("Total Player = " + Player.totalPlayers);
    }
}