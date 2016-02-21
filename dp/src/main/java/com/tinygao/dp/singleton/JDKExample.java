package com.tinygao.dp.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tinygao
 *	</br>
 * 看JDK中的Runtime类，他就是单利，而且是急切实例化模式
 *<pre>
 *  private static Runtime currentRuntime = new Runtime();
 *  public static Runtime getRuntime() {
 *     return currentRuntime;
 *  }
 *  private Runtime() {}
 * </pre>
 */
public class JDKExample{ 
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec(
				"C:/windows/system32/ping.exe www.baidu.com");
		
		
		BufferedReader input = new BufferedReader(new InputStreamReader(
				p.getInputStream(), "gbk"));
		
		String line;
		while ((line = input.readLine()) != null) {
			System.out.println(line);
		}
		 
		input.close();
	}
}
