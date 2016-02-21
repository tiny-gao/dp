package com.tinygao.dp.singleton.methods;

/**
 * {@link Book.class}
 * Book方式中会有多线程问题，我们加锁
 * @author tinygao
 *
 */
public class BookSynchorized {

	private static BookSynchorized book;
	private BookSynchorized() {}
	
	public static synchronized BookSynchorized getInstance() {
		if(book == null) {
			book = new BookSynchorized();
		}
		return book;
	}
}
