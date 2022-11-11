package Abstrack;

public class Wizard extends Player{
    public Wizard(int healPoints, String sex) {
        super(healPoints, sex);
        printMessage(profession);
    }

    @Override
    public String getSpeech() {
        return " Wizaaaard... ";
    }

    @Override
    public int getHitPower() {
        return 5;
    }
}

