package kg.geektech.game.players;

public class Golem extends Hero {


    public Golem(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.GOLEM_ZASHITA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i <heroes.length ; i++) {
            if (boss.getDamage() > 0){
                heroes[i].setHealth(getHealth() + boss.getDamage() / 5);
                this.setHealth(getHealth() - boss.getDamage() / 5);
            }
        }

    }
/*      for (int i = 0; i < heroesHealth.length; i++) {
        if (heroesHealth[4] > 0 && heroesHealth[i] > 0 && bossDamage > 0) {
            heroesHealth[i] += 10;
            heroesHealth[4] -= 10;
        }

    }*/
}