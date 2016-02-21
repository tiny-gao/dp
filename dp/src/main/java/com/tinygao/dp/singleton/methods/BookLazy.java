package com.tinygao.dp.singleton.methods;

/**
 * 这是一种懒实例划方式，这种方式问题是多线程时候
 * 可能会产生多个实例
 * @author tinygao
 *
 */
public class BookLazy {

	private static BookLazy book;
	private BookLazy() {}
	
	public static BookLazy getInstance() {
		if(book == null) {//多线程时候会都成立了
			book = new BookLazy();
		}
		return book;
	}
}
