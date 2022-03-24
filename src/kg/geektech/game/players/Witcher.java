package kg.geektech.game.players;

public class Witcher extends Hero {
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.OJIVIT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean shans = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && shans == true) {
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);
                shans = false;

            }

        }


    }
}
