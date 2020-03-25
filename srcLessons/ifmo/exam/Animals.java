package ifmo.exam;

public class Animals {

    protected String name;
    protected int weight;
    protected int haSpeed;
    protected int waSpeed;

    public int getHASpeed() {
        return haSpeed;
    }

    public void setHASpeed(int HASpeed) {
        this.haSpeed = (int) Math.random()*10+1;;
    }
    public int getWASpeed() {
        return waSpeed;
    }

    public void setWASpeed(int WASpeed) {
        this.waSpeed = (int) Math.random()*10+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animals(String name, int weight, int haSpeed, int waSpeed) {
        setName(name);
        setWeight(weight);
        setHASpeed(haSpeed);
        setWASpeed(waSpeed);
    }
}
