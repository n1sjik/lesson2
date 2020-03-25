package ifmo.Lesson8part2;

import java.util.Date;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random(new Date().getTime());
        //методы
        System.out.println(random2.nextBoolean());
        System.out.println(random2.nextInt(34));

        System.out.println(random2.nextFloat());
        System.out.println(random2.nextDouble());

        int min = 10;
        int max = 100;
        int dif = max - min;
        int randomNum = random2.nextInt(dif + 1) + min;




    }





}
