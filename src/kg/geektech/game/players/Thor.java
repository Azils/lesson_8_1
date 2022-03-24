package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Thor extends Hero {
    private static Random random;

    public Thor(String name, int health, int damage) {
        super(name, health, damage,SuperAbility.THOR_BUFF);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean oglushit = RPG_Game.random.nextBoolean();
        if (oglushit==true){
            System.out.println("Тор оглушил Босса");
            boss.setDamage(0);
        }else {
            boss.setDamage(50);
        }
    }
}
