package Lesson5;

import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {
        //строки - ссылочный тип данных
        //до 9 java хранятся как массив char
        char[] newChar= {'j','i','t','l'};
        System.out.println(Arrays.toString(newChar));
        char someChar = 'j';
        String someString = "jmc";
        //данные хранятся в кодировке UTF - 16 или LATIN-1
        // с 9 java строки хранятся как масив byte[]
        String string1 = "Some string"; //нормальный вариант
        String string3 = "Some string";
        String string2 = new String("Some string"); // не правильный вариант (но рабочий)
        String string4 = new String("Some string");
        // при втором создаются новые строки (с абсолютно одинаковым текстом например 2 и 4)
        // при первом создается ссылка на строку (в 3 ссылка на 1)
        System.out.println(string1 == string3);
        System.out.println(string2.intern() == string4.intern());

        String newString =  new String("new");
        String newString2 = newString.intern();
        //TODO метод intern

        // строки низменны и потокобезопасны

        // конкатенация строк (склеивание строк)

        String str1 = "строка 1";
        String str2 = "строка 2";
        String str3 = "строка 3";

        str1 = str1 + " " + str2;
        System.out.println(str1);

        str2 = str2.concat(" ")
                .concat(str3)
                .concat(" ")
                .concat("Hello")
                .concat(" ")
                .concat("STR")
                .concat(" ")
                .concat(str1);
        System.out.println(str2);

        //каждый вызов concat и + создает новую строку в пуле
        // по сути + и concat это одно и то же
        // + запысывается легче и проще + с 9 версии он оптимизирован лучше
        // если мы просто через sout выводим сообщение через "" то оно все равно попадает в пул строк
        // метод join позволяет склеить любое количество строк через разделитель
        str3 = String.join(" : : : ", str1, str2, someString);
        System.out.println(str3);

        str1 = "строка ";
        for (int i = 0; i < 10 ; i++) {
            str1 +=  " итерация /n" + i;
        }
        System.out.println(str1);
        //если в цикле объединяется много строк то не + не конкат не используется
        // вместо них используется:
        // возможность изменять сроки
        // это классы (не стринг)
        //StringBuilder или StringBuffer
        //StringBuilder - работает быстрее, но не потокобезопасен
        // второй нооборот медленный но потокобезопасен
        //TODO что такое потокобезопасность???
        //суть потокобезопасности
        // пока программа работает в 1 поток все ок
        // программа может выполняться в несколько потоков параллельно
        // и потоки могут обращаться к 1 и тем же объектам одновременно
        // если нет потокобезопасности то нет гарантии что объек будет актуален

        str1 = "строка ";

        StringBuilder sb = new StringBuilder(str1);
        // у объектов sb есть метод оценки
        // append позволяет менять объект sb
        // новые объекты не создаются (хорошо для циклов)
        sb.append(str1).append(" Hello ");
        System.out.println(sb);

        for (int i = 0; i < 10; i++) {
            sb.append(" итерация ").append(i);

        }
        str1 = sb.toString();
        System.out.println(str1);


        char[] charsArr = {'q','w','e'};
        String striChr = new String(charsArr);

        byte[] bytes = striChr.getBytes();
        striChr = new String(bytes);

        //todo глянуть таблицы кодировок в телеге в самом начале

        // методы работы со строками


        str1 = "Java";
        str2 = "java";

        System.out.println(str1.equals(str2)); // с учетом регистра
        System.out.println(str1.equalsIgnoreCase(str2)); // без учета регистра

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        str1 = "Java";
        // сравнивает значение всегда с учетеом регистра
        System.out.println(str1.startsWith("Ja"));
        System.out.println(str1.endsWith("A"));

        str1 = str1.toLowerCase();
        System.out.println(str1);
        str1 = str1.toUpperCase();
        System.out.println(str1);

    }
}
