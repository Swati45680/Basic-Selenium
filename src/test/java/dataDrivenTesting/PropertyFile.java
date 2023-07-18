package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty("username");
		String pw = p.getProperty("password");
		System.out.println(value);
		System.out.println(pw);
		
	}

}
