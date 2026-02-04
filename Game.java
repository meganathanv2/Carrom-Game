
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        CarromBoard board = new CarromBoard(29, "Wood", "Brown");
        board.startGame();

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        Player currentPlayer = p1;

        Striker striker = new Striker();

        Coin black = new Coin("Black");
        Coin white = new Coin("White");
        Coin queen = new Coin("Red");

        int maxTurns = 10;
        int turn = 1;
       

        Random random = new Random();

        while (turn <= maxTurns) {

            System.out.println("\n" + currentPlayer.getName() + " Turn");

            int power = random.nextInt(8) + 1;
            striker.setPower(power);
            striker.hit();

            int outcome = random.nextInt(5);
            boolean coinPocketed = false;

            switch (outcome) {
                case 0:
                    System.out.println("Missed shot!");
                    break;
                case 1:
                    coinPocketed = board.pocketCoin(currentPlayer, black);
                    break;
                case 2:
                    coinPocketed = board.pocketCoin(currentPlayer, white);
                    break;
                case 3:
                    if(board.QueenCount==0)
                    coinPocketed = board.pocketCoin(currentPlayer, queen);
                    break;
                default:
                    board.strikerFoul(currentPlayer);
                    break;
            }
          
            if (!coinPocketed && currentPlayer.hasQueenPocketed()) {
                System.out.println("Queen not covered! Penalty applied.");
                currentPlayer.addScore(-50); 
                currentPlayer.foul();
                currentPlayer.setQueenPocketed(false);
            }

            if (!coinPocketed) {
                currentPlayer = (currentPlayer == p1) ? p2 : p1;
            } else {
                System.out.println(currentPlayer.getName() + " continues!");
            }

            turn++;
        }

        System.out.println("\nFinal Scores");
        System.out.println(p1.getName() + ": " + p1.getScore());
        System.out.println(p2.getName() + ": " + p2.getScore());

        if (p1.getScore() > p2.getScore()) {
            System.out.println(p1.getName() + " wins!");
        } else if (p2.getScore() > p1.getScore()) {
            System.out.println(p2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
