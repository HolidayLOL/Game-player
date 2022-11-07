package Abstrack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player arc = new Wizard(10, "Man");

        Player tobi = new Archer(6, "Man");

        Player axe = new Warrior(15, "Man");

        ArrayList<Player> players = new ArrayList<>();
        players.add(arc);
        players.add(tobi);
        players.add(axe);

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            player.hit(tobi);

        }

    }
}

