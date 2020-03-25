package ifmo.animals;

public class Mouse implements CanBeEaten {
    @Override
    public void CanBeEaten(CanEat enemy) {
        System.out.println("Мышь съедена" + enemy);
    }
}
