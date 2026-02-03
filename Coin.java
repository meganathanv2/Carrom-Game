class Coin {
    String color;    
    boolean pocketed;

    Coin(String color) {
        this.color = color;
        this.pocketed = false;
    }

    void pocket() {
        pocketed = true;
        System.out.println(color + " coin pocketed");
    }
}
