package ifmo.lesson7;

abstract public class unit implements CanRest {
    protected int healthScore;//protected - модификатор значит что доступ к свойству/методу доступен всем потомкам
    // + внутри пакета
    protected String name = "Unit";
    protected int speed;

    public unit(int healthScore, int speed){
        setHealthScore(healthScore);
        setSpeed(speed);
    }


    public int getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(int healthScore) {
        if (healthScore > 0) {
            this.healthScore = (int) (Math.random()*100);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = (int) (Math.random()*5);
    }

    public boolean isAlive(){
        return healthScore > 0;
    }

    public void run() {
        System.out.println(name+" двигается со скоростью "+speed);
    }


}
