package ifmo.lesson7;

import java.util.Scanner;

public class battle {
// при наследовании все дочерние классы получают от родительских все доступные свойства
    // наследование это всегда расширение а не изменение
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите имя первого боевого юнита");
        BattleUnit unit1 = BattleUnit.getBattleUnit(scanner.nextLine());
    System.out.println("Введите имя второго боевого юнита");
        BattleUnit unit2 = BattleUnit.getBattleUnit(scanner.nextLine());
    System.out.println("Введите имя третьего боевого юнита");
        BattleUnit unit3 = BattleUnit.getBattleUnit(scanner.nextLine());

        unit1.attack(unit2);
    }
}
