package com.tinygao.dp.adapter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author tinygao
 *	</br>
 * 看JDK中的OutputStreamWriter,InputStreamReader类
 * 将一个字节流适配器成字符流给第三方使用。
 *<pre>
 * </pre>
 */
public class JDKExample{ 
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new InputStream() {
            
            @Override
            public int read() throws IOException {
                // TODO Auto-generated method stub
                return 0;
            }
        });
		
		isr.read();
		
		OutputStreamWriter osr = new OutputStreamWriter(new OutputStream() {
            
            @Override
            public void write(int b) throws IOException {
                // TODO Auto-generated method stub
                
            }
        }, "utf-8");
	}
}
