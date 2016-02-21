package com.tinygao.dp.singleton.methods;

/**
 * @author tinygao </br>
 * <b>问题1：为什么需要加volatile</b>
 * <p>volatile保证多线程中其中两个特性：有序性、可见性 。
 * 还有一个叫做原子性，他不支持。而synchronize是都有。
 * 这里加了volatile我们可以从有序性和可见性找原因。如果没有
 * 加则代码是可能被重排序或者不可见</p>
 * 
 * <p>重排序：new BookDoubleCheck  有三个伪代码步骤，这里会被重排 </p>
 * 		
 * <b>问题2：synchronized为什么是锁类</b>
 *	<p>
 * {@link http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization}
 * 这篇文章告诉你上面两个问题
 * </p>
 */
public class BookDoubleCheck {

	private volatile static BookDoubleCheck book;
	
	private BookDoubleCheck(){}
	
	public static BookDoubleCheck getInstance() {
		if(book == null) {
			synchronized (BookDoubleCheck.class) {
				if(book == null) {
					book = new BookDoubleCheck();
				}
			}
		}
		return book;
	}
}
