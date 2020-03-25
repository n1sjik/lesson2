package ifmo.exam;

abstract public class WildAnimals extends Animals implements WildAnimalAttack{

    protected int power;

    public WildAnimals(String name, int weight,  int waSpeed) {
        super(name, weight, haSpeed, waSpeed);
        setPower(power);
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = (int) Math.random()*10+1;
    }
}
