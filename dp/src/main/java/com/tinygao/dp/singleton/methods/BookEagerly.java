package com.tinygao.dp.singleton.methods;

/**
 * @author tinygao
 *	急切实例方式，可以避免懒实例多线程问题
 */
public class BookEagerly {
	private static BookEagerly book = new BookEagerly();
	private BookEagerly() {}
	
	public static BookEagerly getInstance() {
		return book;
	}
}
