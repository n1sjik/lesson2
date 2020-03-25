package ifmo.lesson7;

public class king extends unit {
    int gold;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public king(int healthScore, int speed) {
        super(healthScore, speed);
    }

    @Override
    public void rest() {
        System.out.println("Король на отдыхе");
    }
}
