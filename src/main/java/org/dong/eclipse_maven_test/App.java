package org.dong.eclipse_maven_test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Properties pro = new Properties();

    static {
        InputStream in = App.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static String getProperty(String key){
        return pro.getProperty(key);
    }
    public static void main( String[] args )
    {
        System.out.println(getProperty("jdbc_driverClassName"));
        System.out.println(getProperty("jdbc_url"));
        System.out.println( "Hello World!" );
    }
}
