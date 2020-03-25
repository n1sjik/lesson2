package ifmo.lesson7;

public class infantry extends BattleUnit {

    int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public infantry(int healthScore, int speed, int attackScore, int armor) {
        super(healthScore, speed, attackScore);
        setArmor(armor);
    }
    @Override// указатель переопределения родительского метода
    // без override программа работать будет но так же это указатель для компилятора
    public void attack(BattleUnit enemy) {

        if (this != enemy) {
            System.out.println("Пехотинец атакует");
            if (healthScore > 0) {
                enemy.healthScore -= attackScore;
            } else if (healthScore <= 0) {
                System.out.println("Пехотинец мертв");
            } else if (attackScore < enemy.speed) {
                System.out.println("Пехотинец промахнулся");
            }

            System.out.println("Пехотинец нанес " + attackScore + "урона");
            System.out.println(enemy.name + " получил" + attackScore + " урона"
                    + " осталось" + enemy.healthScore + " здоровья");
        }
    }

    @Override
    public void rest() {
        System.out.println("Пехотинец на отдыхе");
    }
}
