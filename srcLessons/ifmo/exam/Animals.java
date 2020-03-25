package ifmo.exam;

public class Animals {

    protected String name;
    protected int weight;


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

    public Animals(String name, int weight) {
        setName(name);
        setWeight(weight);
    }
}
