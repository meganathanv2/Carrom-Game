class Player {
    String name;
    int score;

    Player(String name) {
        this.name = name;
        this.score = 0;
    }

    void addScore(int points) {
        score += points;
        System.out.println(name + " score: " + score);
    }

    void foul() {
        score -= 5;
        System.out.println(name + " committed a foul -5");
    }
}
