package Abstrack;

public abstract class Player {
    private int healPoints = 5;
    int points;
    String name;
    protected String profession;
    String sex;

    public Player(int healPoints, String sex) {
        this.healPoints = healPoints;
        this.sex = sex;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void move() {
        System.out.println(getClass().getSimpleName() + " i`m moving");
    }

    public String getSex() {
        return sex;
    }

    //    public abstract void speak ();
    protected abstract String getSpeech();

    protected abstract int getHitPower();

    public void hit(Player player) {
        System.out.println(getClass().getSimpleName() +
                " Hit " + player.getClass().getSimpleName() + " " + getHitPower());
        if (isPlayerKilled(healPoints, player.getHitPower())) {
            System.out.println(player.getClass().getSimpleName() + " Killed ");
        }

    }

    private boolean isPlayerKilled(int healPoints, int hitPower) {
        if (healPoints - hitPower <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
