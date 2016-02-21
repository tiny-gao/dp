package com.tinygao.dp.factory.single;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author tinygao
 *	</br>
 * 看JDK中的Calendar类，就是简单工厂模式
 *<pre>
  if (aLocale.hasExtensions()) {
            String caltype = aLocale.getUnicodeLocaleType("ca");
            if (caltype != null) {
                switch (caltype) {
                case "buddhist":
                cal = new BuddhistCalendar(zone, aLocale);
                    break;
                case "japanese":
                    cal = new JapaneseImperialCalendar(zone, aLocale);
                    break;
                case "gregory":
                    cal = new GregorianCalendar(zone, aLocale);
                    break;
                }
            }
        }
 * </pre>
 */
public class JDKExample{ 
	public static void main(String[] args) throws IOException {
	   System.out.println( Calendar.getInstance(TimeZone.getDefault()));
	}
}
