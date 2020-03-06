package lesson2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        // внутри 1 фала public class может быть только 1


        // конструкция if
        // if (условие) -> true {
        // код выполняется;}
        //-> false ->
        // else if (условие 2) {
        // код выполняется, если условие2 true;}
        // else {
        // код выпонится если ни одно из указаных условий не true}


      /*  Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int minute = in.nextInt();
        if (minute >= 0 && minute <= 14) {
            System.out.println("первая четверть часа");
        } else if (minute >= 15 && minute <= 30) {
            System.out.println("вторая четверть часа");
        } else if (minute >= 31 && minute <= 45) {
            System.out.println("третья четверть часа");
        } else if (minute >= 46 && minute <= 59) {
            System.out.println("четвертая четверть часа");
        } else {
            System.out.println("Не верная минута");
        }*/

        // для удобного форматирования  cmd alt l

        // switch конструкция
        //  switch () {}

        int codeVar = 222;
        // 111 / 222 / 333 -> "малый приз"
        // 444 / 555       -> "средний приз"
        // 777             -> "большой приз"
        //                 -> "попробуйте еще раз"
        switch (codeVar){
            case 111:
            case 222:
            case 333:
                System.out.println("малый приз");
                break;
            case 444:
            case 555:
                System.out.println("средний приз");
                break;
            case 777:
                System.out.println("большой приз");
                break;
            default:
                System.out.println("попробуйте еще раз");
                break;
        }




        // switch для 12/13
        codeVar = 233;
                switch(codeVar){
                    case 111,222,333 -> System.out.println("малый приз"); // для 1 строки условия
                    case 444,555,777 -> System.out.println("большой приз");
                    default -> System.out.println("попробуй еще раз");
                }




        codeVar = 777;
        String prize = switch (codeVar) {
            case 111,222,333 -> "малый приз"; // для 1 строки условия
            case 444,555,777 -> "большой приз";
            default -> "попробуй еще раз";
        };
        System.out.println(prize);


        codeVar = 565;

        prize = switch (codeVar) {
            case 111,222,333 -> "малый приз"; // для 1 строки условия
            case 444,555,777 -> "большой приз";
            default -> {
                String someRes = "попробуй еще раз";
                        yield someRes; // for java 13 что бы вернуть значение переменной из конструкции
                      //break someRes for java 12
            }
        };
        System.out.println(prize);



    }
}
