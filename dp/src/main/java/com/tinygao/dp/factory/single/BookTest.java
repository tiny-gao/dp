package com.tinygao.dp.factory.single;

public class BookTest {

    public static void main(String[] args) {
        Book book = BookFactory.getBookByName("computer");
        System.out.println(book.getMoney());
    }
}
