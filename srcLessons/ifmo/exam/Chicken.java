package ifmo.exam;

public class Chicken extends HomeAnimals implements CanGetResources,CanBeEatenByF,CanBeEatenByWA {

    protected int chickenResources;

    public int getChickenResources() {
        return chickenResources;
    }

    public void setChickenResources(int chickenResources) {
        this.chickenResources = chickenResources;
    }

    public Chicken(String name, int weight, int speed, int health, int chickenResources) {
        super(name, weight, speed, health);
        setChickenResources(chickenResources);
    }
}
