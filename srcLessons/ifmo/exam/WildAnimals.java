package ifmo.exam;

public class WildAnimals extends Animals {

    protected int power;
    protected int waSpeed;

    public WildAnimals(String name, int weight, int power, int waSpeed) {
        super(name, weight);
        setPower(power);
        setWaSpeed(waSpeed);
    }

    public int getWaSpeed() {
        return waSpeed;
    }

    public void setWaSpeed(int waSpeed) {
        this.waSpeed = waSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = (int) Math.random()*10+1;
    }

}
