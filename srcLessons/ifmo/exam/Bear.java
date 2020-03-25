package ifmo.exam;

public class Bear extends WildAnimals implements WildAnimalAttack {
    public Bear(String name, int weight, int WASpeed, int power) {
        super(name, weight, WASpeed, power);
    }

    @Override
    public void Attack(HomeAnimals enemy) {

    }
}
