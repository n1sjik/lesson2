package ifmo.animals;

public class Wolf implements CanEat{


    @Override
    public void canEat(CanBeEaten enemy) {
        System.out.println("Волк съел" + enemy);
    }
}
