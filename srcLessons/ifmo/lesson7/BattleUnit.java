package ifmo.lesson7;

abstract public class BattleUnit extends unit implements CanAttack{
    // extends - наследование из класса unit(родитель), battleUnit (дочерний)
    // множественное наследование классов через extends запрещено
    // implements - реализует методы интерфейса,
    // класс обязан реализовать все методы интерфейса без реализации
    // можно имплиментировать несколько интерфейсов
    // abstract - абстрактный класс нен можем создать объект
    // у абстрактных классов могут быть как методы с реалзацией так и с реализацией

    protected int attackScore;

    public BattleUnit(int healthScore, int speed, int attackScore) {
        super(healthScore, speed);// вызов конструктора родительского класса
        setAttackScore(attackScore);

    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = (int) (Math.random()*10);
    }


    @Override
    public void runFromField() {

    }

    public static BattleUnit getBattleUnit (String type){
        BattleUnit battleUnit = null;
        if ("knight".equals(type)){
            battleUnit = new knight(
                     ((int) (Math.random()*10)+2)
                    ,((int) (Math.random()*7)+1)
                    ,((int) (Math.random()*8)+1)
                    ,((int) (Math.random()*13)+3)
            );
        }
        else if ("doctor".equals(type)){
            battleUnit = new doctor(
                     ((int) (Math.random()*10)+2)
                    ,((int) (Math.random()*7)+1)
                    ,((int) (Math.random()*8)+1)
                    ,((int) (Math.random()*13)+3)
            );
        }
        else if ("infantry".equals(type)){
            battleUnit = new infantry(
                     ((int) (Math.random()*10)+2)
                    ,((int) (Math.random()*7)+1)
                    ,((int) (Math.random()*8)+1)
                    ,((int) (Math.random()*13)+3)
            );
      }
        return battleUnit;
//        if ("knight".equals(type)){
//            return new knight(
//                    ((int) (Math.random()*10)+2)
//                    ,((int) (Math.random()*7)+1)
//                    ,((int) (Math.random()*8)+1)
//                    ,((int) (Math.random()*13)+3)
//            );
//        }
//        if ("doctor".equals(type)){
//            return new doctor(
//                    ((int) (Math.random()*10)+2)
//                    ,((int) (Math.random()*7)+1)
//                    ,((int) (Math.random()*8)+1)
//                    ,((int) (Math.random()*13)+3)
//            );
//        }
//        if ("infantry".equals(type)){
//            return new infantry(
//                    ((int) (Math.random()*10)+2)
//                    ,((int) (Math.random()*7)+1)
//                    ,((int) (Math.random()*8)+1)
//                    ,((int) (Math.random()*13)+3)
//            );
//        }
//
//        return null;
    }


}
