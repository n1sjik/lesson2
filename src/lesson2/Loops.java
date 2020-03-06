package lesson2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // цикл while
        //while (условие если условие false то программа в цикл не заходит
        // если true то выполняются все тело цикла до момента когда условие не становится false)
        // {
        // тело цикла
        // }

        /*Scanner in = new Scanner(System.in);
                while (true) {
                    System.out.println("введите целое число");
                    int someNum = in.nextInt();
                    if (someNum == 0) {
                        System.out.println("выход из программы");
                        break; // прерывание цикла (в таком виде только текущего цикла)
                    }
                    System.out.println(someNum * someNum);
                }*/

       /* Scanner in = new Scanner(System.in);
        int someRandomNum = (int) (Math.random() * 6) + 1;
        while (true) {
            System.out.println("введите целое число от 1 до 6");
            int someNum = in.nextInt();
            if (someNum < someRandomNum) {
                System.out.println("загаданное число больше");
            }
            else if (someNum > someRandomNum) {
                System.out.println("загаданное число меньше");
            }
            else {
                System.out.println("вы угадали");
                break;
            }
            }*/

        // цикл for
        // for (счетчик (блок инициализации),(может быть несколько через ",");
        // (условие),(может быть несколько через ",");
        // обновление счетчиков (после выполнения тела),(может быть несколько через ","))
        // {тело цикла}


        // генерирует сама среда коммандой fori
        // continue - переход на след итерацию

/*

        for (int i = 0; i < 600 ; i++) {
            if (i % 1 == i) continue;
            System.out.println(i);
        }


*/





    }
}
