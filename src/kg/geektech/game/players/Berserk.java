package kg.geektech.game.players;

public class Berserk extends Hero {
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
       int uronBossa =  boss.getDamage() / 2;
        this.setDamage(getDamage()+uronBossa);
    }

}
