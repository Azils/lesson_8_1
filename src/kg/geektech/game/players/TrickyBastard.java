package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class TrickyBastard extends Hero {
    public TrickyBastard(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.HITRIY);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean shans = RPG_Game.random.nextBoolean();
        if (shans == true) {
            this.setDamage(0);
            this.setHealth(0);
        } else {
            this.setHealth(250);
            this.setDamage(15);
        }
    }
}
