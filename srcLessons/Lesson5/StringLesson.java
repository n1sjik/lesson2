package Lesson5;

public class StringLesson {
    public static void main(String[] args) {
        //строки - ссылочный тип данных
        //
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
        // конкатенация строк(склеивание строк)





    }
}
