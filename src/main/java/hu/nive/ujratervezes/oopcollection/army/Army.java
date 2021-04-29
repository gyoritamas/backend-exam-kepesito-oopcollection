package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<MilitaryUnit> militaryUnitList;

    public Army() {
        militaryUnitList = new ArrayList<>();
    }

    void addUnit(MilitaryUnit militaryUnit) {
        militaryUnitList.add(militaryUnit);
    }

    void damageAll(int damage) {
        militaryUnitList.forEach(unit -> unit.sufferDamage(damage));
        militaryUnitList.removeIf(unit -> unit.getHitPoints() < 25);
    }

    int getArmyDamage() {
        if (militaryUnitList.isEmpty())
            return 0;

        return militaryUnitList.stream()
                .map(MilitaryUnit::doDamage)
                .reduce(Integer::sum).get();
    }

    int getArmySize() {
        return militaryUnitList.size();
    }
}