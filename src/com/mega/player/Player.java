package com.mega.player;

public class Player {

    private final String name;
    private int score;
    private boolean queenPocketed;
    private int fouls;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.queenPocketed = false;
        this.fouls = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public boolean hasQueenPocketed() {
        return queenPocketed;
    }

    public void setQueenPocketed(boolean queenPocketed) {
        this.queenPocketed = queenPocketed;
    }

    public void foul() {
        fouls++;
        System.out.println(name + " committed a foul! Total fouls: " + fouls);
    }
}
