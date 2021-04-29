package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private final int attackPower;
    private final boolean hasArmor;

    public MilitaryUnit(int hitPoints, int attackPower, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.hasArmor = hasArmor;
    }

    protected int doDamage() {
        return attackPower;
    }

    protected void sufferDamage(int damage) {
        hitPoints -= hasArmor ? damage * 0.5 : damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
