package lesson2;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        // массивы ((((
        // непрерывная область памяти для хранения данных одного типа
        // сначала задается тип данных потом имя массива int arrName
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
    }
}
