package ru.ifmo.base.lesson6;
// библиотека:
// можно добавлять по 1 или несколько
// можно взять книгу домой (указав автора)
// домой / для чтения в библиотеке

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name = "Библиотека";
    private Book[] books = new Book[25];

    public String getName() {
        return name;
    }

    //добавление 1 книги

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                newBook.setInLib(true);
                books[i] = newBook;
                break;
            }
        }
    }


    //добавление нескольких книг
    public void addBook(Book... newBooks) {
        // TODO реализация метода
        // ... - переменное количество аргументов
        for (int i = 0; i <books.length ; i++) {
            for (int j = 0; j < newBooks.length; j++) {
                if (books[i] == null && newBooks[j] != null) {
                    newBooks[j].setInLib(true);
                    System.arraycopy(newBooks, j, books, i, newBooks.length);
                    break;
                }
            }
        }

    }

    public Book getHome(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null
                    && books[i].getBookName().equals(bookName)
                    && books[i].isInLib() == true
                    && books[i].isForHome() == true ) {
                books[i].setInLib(false);
                return books[i];
            }
        }
        return null;
    }


}

