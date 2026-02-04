class CarromBoard {

    private int size;
    private String material;
    private String color;

    public CarromBoard(int size, String material, String color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public void startGame() {
        System.out.println("Carrom game started on " + material + " board");
    }

   public boolean pocketCoin(Player player, Coin coin) {

    if (coin.getColor().equals("Red")) {
        player.addScore(50);
    } else {
        player.addScore(10);
    }

    return true; 
}


   public boolean strikerFoul(Player player) {
    player.foul();
    return false; 
}

}
