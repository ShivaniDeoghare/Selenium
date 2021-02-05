package Date28jan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData2
{
  public static void main(String[] args) throws Exception, InvalidFormatException, FileNotFoundException, IOException
  {
	  String path="‪E:\\Datawrite.xlsx";
	  File fis = new File(path);
	  Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	  Sheet sh = wb.createSheet("ValidLogin1");
	  Cell cl = sh.createRow(0).createCell(0);
	  cl.setCellValue("Username");
	  sh.getRow(0).createCell(1).setCellValue("Password");
	  FileOutputStream fio = new FileOutputStream(path);
	  wb.write(fio);
	  System.out.println("done");
	  wb.close();
  }

}
