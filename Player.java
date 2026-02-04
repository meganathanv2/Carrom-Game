class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
        System.out.println(name + " score: " + score);
    }

    public void foul() {
        score -= 5;
        System.out.println(name + " committed a foul (-5)");
    }
}
