package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean shieldIntact;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
        shieldIntact = true;
    }

    @Override
    protected void sufferDamage(int damage) {
        if (shieldIntact) {
            shieldIntact = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}