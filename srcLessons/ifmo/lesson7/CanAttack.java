package ifmo.lesson7;

public interface CanAttack {

    // на основе интерфейса невозможно создать объект
    // до 8 версии у методов могут быть только без реализации
    // те без {}

    void attack (BattleUnit enemy);

    default  void runFromField(){
        System.out.println("СБЕЖАЛ!!!!! сцук");
    }

}
