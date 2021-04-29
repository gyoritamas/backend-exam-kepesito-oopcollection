package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean firstAttack;

    public HeavyCavalry() {
        super(150, 20, true);
        firstAttack = true;
    }

    @Override
    protected int doDamage() {
        if (firstAttack) {
            firstAttack = false;
            return super.doDamage() * 3;
        } else {
            return super.doDamage();
        }
    }
}