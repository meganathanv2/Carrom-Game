package com.mega.board;

import com.mega.coins.Coin;
import com.mega.player.Player;

public class CarromBoard {

    private final int size;
    private final String material;
    private final String color;
    public int QueenCount = 0;

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
            System.out.println("Queen pocketed! Must be covered.");
            player.addScore(50);
            player.setQueenPocketed(true);
        } else {
            player.addScore(10);

            QueenCount = 1;
            if (player.hasQueenPocketed()) {
                System.out.println("Queen covered successfully!");
                player.setQueenPocketed(false);
            }
        }

        return true;
    }

    public boolean strikerFoul(Player player) {
        player.foul();
        return false;
    }

}
