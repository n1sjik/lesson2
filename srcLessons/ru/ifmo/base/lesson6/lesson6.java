package ru.ifmo.base.lesson6;

public class lesson6 {
    public static void main(String[] args) {
        //синтаксис классов объектов и пакетов
        //пакет называется на анг. без пробелов. сначала название компании, название проекта, название пакета

        //все объекты создаются на основе зарание описанных классов, в классе описаны характеристики взаимодействия
        // объектов
        // класс это строго определенный тип объектов, 1 класс - 1 объект
        // библиотека:
            // можно добавлять по 1 или несколько
            // можно взять книгу домой (указав автора)
            // домой / для чтения в библиотеке
        // книги:
        // для каждой книги:
        // название
        // , кол-во страниц
        // , автор(имя фамилия 1 автор 1 книга)
        // , можно ли брать домой
        // , доступна ли для выдачи
        Author author1 = new Author();// вызов конструктора
        author1.setName("Брюс");
        author1.setSurname("Эккель");
        Author author2 = new Author();
        author2.setName("Роберт");
        author2.setSurname("Мартин");

        System.out.println(author1.getName());
        String name = author2.getName();
        System.out.println(name);
        System.out.println(author1);

        Book book1 = new Book("",0);
        Book book2 = new Book("Философия", 2134);
        System.out.println(book1);
        // объект создается со значениями по умолчанию
        // для
        // boolean = false
        // int = 0
        // string = 'null'

        // если мы в классе описаль хотя бы 1 конструктор то конструктор по умолчанию (без параметров)
        // будет не доступен
        book1.setBookName("Философия");
        book1.setPageCount(1350);
        book1.setAuthor(author1);
        book1.setForHome(true);

        book2.setAuthor(author2);

        System.out.println(book1);
        System.out.println(book2);

        String book1AuthorName = book1.getAuthor().getName();
        System.out.println(book1AuthorName);

        Book[] books = {book1,book2};

        for (Book elem: books) {
            System.out.println(elem.getAuthor().getSurname());
        }

        Library lib = new Library();
        lib.addBook(book1,book2);


    }
}
