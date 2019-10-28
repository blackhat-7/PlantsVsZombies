package sample;

public abstract class Plant extends Character {
    private int availability_to_buy_time, price;

    public Plant() {

    }
}

class Sunflower extends Plant {
    private int SUNFLOWER_POWER, SUNFLOWER_PRICE, SUN_GENERATE_TIME, SUN_VALUE;

    public void showGif() {
        
    }
}

class PeaShooter extends Plant {
    private int PEASHOOTER_ATTACK_POWER, PEASHOOTER_PRICE, PEASHOOTER_HP;

    public void showGif() {

    }
}

class Walnut extends Plant {
    private int WALNUT_HP, WALNUT_PRICE;

    public void showGif() {

    }
}

class Repeater extends Plant {
    private int REPEATER_ATTACK_POWER, REPEATER_PRICE, REPEATER_HP;

    public void showGif() {

    }
}

class Watermelon extends Plant {
    private int WATERMELON_ATTACK_POWER, WATERMELON_PRICE, WATERMELON_HP;

    public void showGif() {

    }
}

