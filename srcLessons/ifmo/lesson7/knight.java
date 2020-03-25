package ifmo.lesson7;

public class knight extends BattleUnit {
    int horseSpeed;

    public int getHorseSpeed() {
        return horseSpeed;
    }

    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    public knight(int healthScore, int speed, int attackScore, int horseSpeed) {
        super(healthScore, speed, attackScore);
        setHorseSpeed(horseSpeed);
    }
    @Override// указатель переопределения родительского метода
    // без override программа работать будет но так же это указатель для компилятора
    public void attack(BattleUnit enemy) {

        if (this != enemy) {
        System.out.println("Рыцарь атакует");
        if (healthScore > 0) {
            enemy.healthScore -= attackScore;
        }
        else if (healthScore <= 0) {
            System.out.println("Рыцарь мертв");
        } else if (attackScore < enemy.speed){
            System.out.println("Рыцарь промахнулся");
        }

        System.out.println("Рыцарь нанес " + attackScore + " урона");
        System.out.println(enemy.name + " получил" + attackScore + " урона"  + " осталось" + enemy.healthScore + " здоровья"   );
    }
    }

    @Override
    public void rest() {
        System.out.println("Рыцарь на отдыхе");
    }
}
