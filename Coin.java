class Coin {
    private String color;
    

    public Coin(String color) {
        this.color = color;
     
    }

    public String getColor() {
        return color;
    }

    public void pocket() {
        System.out.println(color + " coin pocketed");
    }
}
