package ifmo.exam;

abstract public class HomeAnimals extends Animals implements CanRunOut{

    protected int health;

    public HomeAnimals(String name, int weight, int haSpeed, int health) {
        super(name, weight, haSpeed, waSpeed);
        setHealth(health);

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void Healing (int health){
    }


    @Override
    public void Run() {
        if (haSpeed >  waSpeed){
            System.out.println();
        }
    }
}
