class Striker {
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void hit() {
        System.out.println("Striker hit with power " + power);
    }
}
