public class Game {
    public static void main(String[] args) {

        CarromBoard board = new CarromBoard(29, "Wood", "Brown");
        board.startGame();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Striker striker = new Striker(5);

        Coin black = new Coin("Black");
        Coin white = new Coin("White");
        Coin queen = new Coin("Red");


        System.out.println("\nPlayer 1 Turn");
        striker.hit();
        board.pocketCoin(p1, black);

        System.out.println("\nPlayer 2 Turn");
        striker.hit();
        board.pocketCoin(p2, queen);

        System.out.println("\nFoul Occurred");
        board.strikerFoul(p1);
        
        System.out.println("\nFinal Scores");
        System.out.println(p1.name + ": " + p1.score);
        System.out.println(p2.name + ": " + p2.score);

        if(p1.score > p2.score) {
            System.out.println(p1.name + " wins!");
        } else if(p2.score > p1.score) {
            System.out.println(p2.name + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        
    }
}
