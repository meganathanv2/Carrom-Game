
class CarromBoard {

    int size;
    String material;
    String color;

    CarromBoard(int size, String material, String color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    void startGame() {
        System.out.println("Carrom game started on" + material + " board");
    }

    void pocketCoin(Player player, Coin coin) {
        if (!coin.pocketed) {
            coin.pocket();

            if (coin.color.equals("Red")) {
                player.addScore(50);
            } else {
                player.addScore(10);
            }
        }
    }

    void strikerFoul(Player player) {
        player.foul();
    }
}
