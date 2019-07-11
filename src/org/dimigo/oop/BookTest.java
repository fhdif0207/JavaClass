package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 정석");
        book.setAuthor("홍성대");
        book.setPage(350);

        Book book3 = new Book("Word Master", "김재영", 300);
        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPage());


    }
}
