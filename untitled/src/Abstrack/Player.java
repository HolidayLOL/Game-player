package Abstrack;

public abstract class Player {
    private static final String MESSAGE_DEATH = "Died ";
    private static final String HERO_WARRIOR = "Warrior ";
    private static final String HERO_ARCHER = "Archer ";
    private static final String GERO_WIZARD = "Wizard ";
    private int healPoints;
    int points;
    protected String profession;
    String sex;

     Player(int healPoints, String sex) {
        this.healPoints = healPoints;
        this.sex = sex;
    }

    protected int getHealPoints() {
        return healPoints;
    }

    private void move() {
        System.out.println(getClass().getSimpleName() + " i`m moving");
    }

    protected String getSex() {
        return sex;
    }

    protected abstract String getSpeech();

    protected abstract int getHitPower();

    public void hit(Player player) {
        printMessage(getClass().getSimpleName() +
                " Hit " + player.getClass().getSimpleName() + " " + getHitPower());
        if (isPlayerKilled(healPoints, player.getHitPower())) {
            printMessage(player.getClass().getSimpleName() + " Killed ");
        }
    }

    private boolean isPlayerKilled(int healPoints, int hitPower) {
        if (healPoints - hitPower <= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printMessage(String message) {
        System.out.println(message);}
}

