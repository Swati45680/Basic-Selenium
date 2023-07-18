package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelFileRead {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Selenium.xlsx");
		WorkbookFactory.create(fis);

	}

}
