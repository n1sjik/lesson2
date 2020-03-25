package ru.ifmo.base.lesson6;
// название
// , кол-во страниц
// , автор(имя фамилия 1 автор 1 книга)
// , можно ли брать домой
// , доступна ли для выдачи
public class Book {

    private String bookName;
    private int pageCount;
    private Author author;
    private boolean isForHome;
    private boolean isInLib;



    public Book(String bookName, int pageCount) {
        this.bookName = bookName;
        this.pageCount = pageCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isForHome() {
        return isForHome;
    }

    public void setForHome(boolean forHome) {
        isForHome = forHome;
    }

    public boolean isInLib() {
        return isInLib;
    }

    public void setInLib(boolean inLib) {
        isInLib = inLib;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                ", isForHome=" + isForHome +
                ", isInLib=" + isInLib +
                '}';
    }
}

