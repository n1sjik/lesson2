package ru.ifmo.base.lesson6;

import java.util.Scanner;

public class Author {
    // свойства
    private String name; // если нужны какие то проверки то доступ
    // к изменению возможен только внутри класса используют модификатор доступа
    // private
    private String surname;

    //для создания средой стандартных методов (например setter) alt+insert или cmd+n
    //todo вспомнить регулярки джавы для описания текста


    public //модификатор доступа
    void // если ничего не возвращает то void если возвращает то тип данных в методе
    setName(String name) // аргумент
    {
        if (name.length() >= 2) {
            //&& !"".equals(name) не пустота
            // name != null
            this.name = name;// tris - это ссылка на текущий объект
        }
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (!"".equals(surname)){
        this.surname = surname;
        }
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
