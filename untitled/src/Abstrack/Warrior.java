package Abstrack;

public class Warrior extends Player{
    public Warrior(int healPoints, String sex) {
        super(healPoints, sex);
    }

    @Override
    public String getSpeech() {
        return " Warriooor... ";
    }

    @Override
    public int getHitPower() {
        return 20;
    }
}
