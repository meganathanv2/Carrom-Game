class Player {
    private String name;
    private int score;
    private boolean queenPocketed = false;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public boolean hasQueenPocketed() {
        return queenPocketed;
    }

    public void setQueenPocketed(boolean value) {
        queenPocketed = value;
    }

    public void addScore(int points) {
        score += points;
        System.out.println(name + " score: " + score);
    }

    public void foul() {
        score -= 5;
        System.out.println(name + " committed a foul (-5)");
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
