package ifmo.exam;

public class Cow extends HomeAnimals implements CanGetResources,CanBeEatenByF,CanBeEatenByWA {

    protected int cowResources;

    public int getCowResources() {
        return cowResources;
    }

    public void setCowResources(int cowResources) {
        this.cowResources = cowResources;
    }

    public Cow(String name, int weight, int speed, int health, int cowResources) {
        super(name, weight, speed, health);
        setCowResources(cowResources);
    }
}
