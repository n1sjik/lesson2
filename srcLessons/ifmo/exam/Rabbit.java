package ifmo.exam;

public class Rabbit extends HomeAnimals implements CanBeEatenByF,CanBeEatenByWA {

    public Rabbit(String name, int weight, int speed, int health) {
        super(name, weight, speed, health);
    }
}
