package Date4FebTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvide
 {
   @DataProvider
   public static String[][] demo1() throws Exception, InvalidFormatException, FileNotFoundException, IOException
   {
	   String path="E:\\Book1.xlsx";
	   String[][] str;
		File fis = new File(path);
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		Sheet sh = wb.getSheet("sheet1");
		int rowcount=sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		str = new String[rowcount-1][firstRow.getLastCellNum()];
		for (int i = 1; i < rowcount; i++)
		{
			for (int j = 0; j< firstRow.getLastCellNum(); j++) 
			{ 
				str[i-1][j]= sh.getRow(i).getCell(j).toString();
     		}
		}
		return str;
   }
   
   @Test(dataProvider="demo1")
   public void tc(String user , String pass)
   {
   Reporter.log(user+" " + pass , true);
}
   }
