package com.tinygao.dp.factory.single;

public class BookFactory {
    public static Book getBookByName(String name) {
        switch (name) {
        case "computer":
            return new ComputerBook();
        case "history":
            return new HistoryBook();
        default:
            return null;
        }
    }
}
