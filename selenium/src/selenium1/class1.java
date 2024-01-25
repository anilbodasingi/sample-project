package selenium1;

import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class class1 {
	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
          String path ="C:\\Users\\LENOVO L460\\Desktop\\excel for selenium.xlsx";
			
			//String path="C:\\Users\\Abhishek\\OneDrive\\Desktop\\ExcelDataOct.xlsx";
			
			FileInputStream file=new FileInputStream(path);
			
			// FileInputStream is class- obtains the input bytes from the file in the file system.
			
			Workbook work=WorkbookFactory.create(file);
			
			
			String value=work.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
			System.out.println(value);
			
			int num=(int) work.getSheet("Sheet1").getRow(6).getCell(1).getNumericCellValue();
			System.out.println(num);
			
			Date date=work.getSheet("Sheet1").getRow(7).getCell(1).getDateCellValue();
			System.out.println(date);
			
		}

	}




		
		
		
		
		
		
		
		
		
		
		
