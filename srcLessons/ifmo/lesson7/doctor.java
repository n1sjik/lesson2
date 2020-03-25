package ifmo.lesson7;

public class doctor extends BattleUnit {
    int medicineScore;

    public int getMedicineScore() {
        return medicineScore;
    }

    public void setMedicineScore(int medicineScore) {
        this.medicineScore = (int) (Math.random()*10);
    }

    public doctor(int healthScore, int speed, int attackScore, int medicineScore) {
        super(healthScore, speed, attackScore);
        setMedicineScore(medicineScore);
    }

    @Override// указатель переопределения родительского метода
    // без override программа работать будет но так же это указатель для компилятора
    public void attack(BattleUnit enemy) {
        if (this != enemy) {

            System.out.println("Доктор атакует");
            if (healthScore > 0) {
                enemy.healthScore -= attackScore;
            } else if (healthScore <= 0) {
                System.out.println("Доктор мертв");
            } else if (attackScore < enemy.speed) {
                System.out.println("Доктор промахнулся");
            }

            System.out.println("Доктор нанес " + attackScore + " урона");
            System.out.println(enemy.name + " получил" + attackScore + " урона"
                    + " осталось" + enemy.healthScore + " здоровья");
        }
    }

    @Override
    public void rest() {
        System.out.println("Доктор на отдыхе");
    }
}
