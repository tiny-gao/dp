package com.tinygao.dp.singleton.methods;


/**
 * @author tinygao
 *
 */
public enum BookEnum {
	BOOK;
	
	/*	client可以这样调用
	 * {@code BookEnum.BOOK.other()}
	 * */
	public void other() {
		System.out.println("我是单利book中的一个方法");
	}
}
