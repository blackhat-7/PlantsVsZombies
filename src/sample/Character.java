package sample;

import java.io.Serializable;

public abstract class Character implements Serializable, Cloneable {
    private static long serialVersionUID = 1L;
    private boolean is_dead;
    private int attack_power, pos_x, pos_y, current_hp, max_hp;

    Character() {

    }

    public abstract void showGif();

    public int getAttackPower() {
        return attack_power;
    }

    public void setAttackPower(int x) {
        attack_power = x;
    }

    public boolean isDead() {
        return is_dead;
    }

    public int getPosX() {
        return pos_x;
    }

    public int getPosY() {
        return pos_y;
    }

    public void setPosX(int x) {
        pos_x = x;
    }

    public void setPosY(int y) {
        pos_y = y;
    }
}
