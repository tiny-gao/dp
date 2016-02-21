package com.tinygao.dp.singleton.instance.privateconstruct.cannotrefrect;

import java.io.Serializable;

/**
 * 在《effective java》中提到这种方法，说明如下：
 * “这种方法在功能上与共有域方法相近，但是它更加简洁，无偿地提供了序列化机制，绝对防止
 * 多次实例化，即使在面对复杂的序列化或反射攻击的时候。虽然这种方法还没有广泛采用，但是
 * 单元素的枚举类型已经成为实现Singleton的最佳方法。”
 * @author tinygao
 *
 */
public enum Book implements Serializable{
	
	BOOK("tinygao",10);
	
	private String name;
	private int money;
	
	private Book(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book[").append(hashCode()).append("] {name=").append(name).append(", money=").append(money)
				.append("}");
		return builder.toString();
	}
}
