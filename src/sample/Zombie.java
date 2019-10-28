package sample;

public abstract class Zombie extends Character {
    private boolean reached_end;
    private double move_speed;
    private int zombie_count, level, name;
    Zombie() {

    }
}

class BaseZombie extends Zombie {
    private String BASIC_NAME;
    private double BASIC_SPEED;
    private int BASIC_HIT;

    public void showGif() {

    }
}

class ConeHead extends Zombie {
    private boolean coneOn;
    private String CONE_NAME;
    private double CONE_SPEED;
    private int CONE_HIT;

    public void showGif() {

    }
}

class bucketHead extends Zombie {
    private boolean bucketOn;
    private String BUCKET_NAME;
    private double BUCKET_SPEED;
    private int BUCKET_HIT;

    public void showGif() {

    }
}

class Runner extends Zombie {
    private boolean runningOn;
    private String RUNNER_NAME;
    private double RUNNER_SPEED;
    private int RUNNER_HIT;

    public void showGif() {

    }
}

class Boss extends Zombie {
    private boolean BOSS_NAME;
    private double BOSS_SPEED;
    private int BOSS_HIT;

    public void showGif() {

    }
}