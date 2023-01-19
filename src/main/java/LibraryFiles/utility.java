package LibraryFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility 
{
   public static String getTD(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
   {
	   FileInputStream file = new FileInputStream("C:\\Users\\khushbu\\git\\PBModule2\\TEST DATA for module2\\Book1.xlsx");
	   
	   Sheet sh = WorkbookFactory.create(file).getSheet("Book1");
	   String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	   return value;
   }
}
