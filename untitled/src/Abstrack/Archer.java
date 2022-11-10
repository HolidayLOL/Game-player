package Abstrack;

public class Archer extends Player {
    public Archer(int healPoints, String sex) {
        super(healPoints, sex);
    }

    @Override
    public String getSpeech() {
        return " Archeer... ";
    }

    @Override
    public int getHitPower() {
        return 10;
    }
}


