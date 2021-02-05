package Date27jan;

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

public class ReadData 
{
  public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
  {
	String path="E:\\Book1.xlsx";
	File fis = new File(path);
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	Sheet sh = wb.getSheet("sheet1");
	int rowcount=sh.getPhysicalNumberOfRows();
	Row firstRow = sh.getRow(0);
	for (int row = 0; row < rowcount; row++)
	{
		for (int col = 0; col < firstRow.getLastCellNum(); col++) 
		{ 
			Cell cl = sh.getRow(row).getCell(col);
			System.out.println(cl);
			
		}
	}
	
	
	
	
}
}
