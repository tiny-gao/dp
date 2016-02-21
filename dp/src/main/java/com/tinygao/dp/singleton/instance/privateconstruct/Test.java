package com.tinygao.dp.singleton.instance.privateconstruct;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;

public class Test {

	public static void computeTime(FunctionalInterfaceTest function) {
		int i = 0;
		int max = 1;
		long start = System.nanoTime();
		while(i<max) {
			function.display();
			i++;
		}
		System.out.println("waster ms:" +(System.nanoTime() - start)/1000000);
	}
	
	public static void main(String[] args) {
		computeTime(newObj());	
		computeTime(reflectObj());	
		computeTime(serialObj());	
	}

	public static FunctionalInterfaceTest newObj() {
		FunctionalInterfaceTest test = ()-> {
			/*编译出错，private方法不能用new*/
			/*Book obj = new Book();
			obj.setName("new");
			obj.setMoney(1);*/
		};
		return test;
	}

	public static FunctionalInterfaceTest reflectObj() {
		
		FunctionalInterfaceTest test = ()->{
			Class<Book> clazz1 = Book.class;
			Book obj = null;
			try {
				for(Constructor<?> a : clazz1.getDeclaredConstructors() ){
					a.setAccessible(true);
					try {
						obj = (Book) a.newInstance();
					} catch (IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			obj.setMoney(2);
			obj.setName("reflect");
			System.out.println(obj);
		};
		return test;
	}
	
	public static FunctionalInterfaceTest serialObj() {
		FunctionalInterfaceTest test = ()->{
		Gson gson = new Gson();
		Book obj = gson.fromJson("{\"name\":\"serial\", \"money\":3}", Book.class);
		System.out.println(obj);
		};
		return test;
	}
}
