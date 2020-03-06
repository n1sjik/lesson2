package lesson2;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        // массивы ((((
        // непрерывная область памяти для хранения данных одного типа
        // сначала задается тип данных потом размер массива , а потом имя массива int[..] arrName
        // кажды элемент массива хранится под индексами(начинаются с 0)
        // объявление массива '[]'

        int[] someArr; // 1 variant predpoctitelniy
        //int someArr2[]; // 2 variant hrenoviy

        //создание массивов
        // массивы ссылочные типы данных задается через new
        // для целых чисел значения по умолчанию "0"
        // для дробных 0.0
        // для boolean это false
        // для ссылочных это null

        someArr = new int[7]; // 7 это размер массива и размер массива изменить нельзя
        // вывод массива на экран делается через Arrays (пакет java.utils)
        System.out.println(Arrays.toString(someArr));

        // второй тип объявления
        int[] someArr2 = {37,51,532,532,4,32,41,32,31,2,3,12,4,-11};
        System.out.println(Arrays.toString(someArr2));
        // многомерные массивы
        int[][][] someArr3;
        someArr3 = new int[7][5][23];
        System.out.println(Arrays.toString(someArr3));


        // размер массива можно узнать
        System.out.println(someArr2.length);


        // доступ к эллементам массива пишем имя массива а потом пишем индекс элемента к которому хотим обратится
        // индекс указывается у [] можно указывать с скобках какое то выражение но главное получить int
        System.out.println(someArr2[11]);

        System.out.println(someArr2[1] + someArr2[2+9]);

        //System.out.println(someArr2[32132]);

        someArr[2] = 456;
        System.out.println(Arrays.toString(someArr));

        //переопределение рание объявленного массива
        // для массивов объявленных как new int[длинна]
        someArr = new int[23]; // 23 это размер массива и размер массива изменить нельзя
        //

        someArr2 = new int[]{23,1,-10,5};

        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] *= 2;
        }
        System.out.println(Arrays.toString(someArr2));
        //здесь меняются данные в массиве


        someArr2 = new int[]{23,1,-10,5};

        for (int  elem: someArr2) {
            elem *= 2;
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(someArr2));
        // здесь на выходе они неизменны


        // копирование массивов
        someArr = new int[23];
        someArr2 = new int[]{23,1,-10,5};

        int[] arr = someArr2;
        // это не копирование массива а ссылка на него (просто дали еще 1 имя(ссылку))

        // варианты копирования 1) полное копирование
        int[] cloneArr = someArr2.clone();

        // 2 вариант из одного в другой
        someArr2 = new int[]{23,1,-10,5}; // из которого
        someArr = new int[15]; // в который
        System.arraycopy(someArr2, 1, someArr, 3,2);
        System.out.println(Arrays.toString(someArr));
        //вывод массива   класс аарайс метод ту стринг (имя массива)

        // 3 вариант
        int[] copyArr = Arrays.copyOf(someArr2,3);
        System.out.println(Arrays.toString(copyArr));



        // сравнение массивов
        someArr2 = new int[]{23,1,-10,5};
        someArr = new int[]{23,1,-10,5};
        // ссылочные типы не сравниваются через "="
        System.out.println(Arrays.equals(someArr,someArr2));
        //метод возвращает true or false

//        someArr == someArr2
//        someArr.equals(someArr2)
//        это сравнение ссылок а не содержимого массива
        someArr2 = new int[]{12,10,-123,6};
        someArr = new int[]{23,1,-10,5};
        int[] resultArr = new int[someArr.length];

        for (int i = 0; i < someArr.length; i++) {
            resultArr[i] = someArr[i] + someArr2[i];
        }
        System.out.println(Arrays.toString(resultArr));



    }
}
