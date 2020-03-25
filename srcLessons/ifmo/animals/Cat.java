package ifmo.animals;

public class Cat implements CanEat,CanBeEaten {


    @Override
    public void CanBeEaten(CanEat enemy) {
        System.out.println("Кот съел " + enemy);
    }

    @Override
    public void canEat(CanBeEaten enemy) {
        System.out.println("Кот седен " + enemy);
    }
}
