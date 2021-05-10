package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelWithForLoop {

	public static void main(String[] args) throws Exception {
		
		
		@SuppressWarnings("unused")
		File src= new File("D:\\TestData\\ExcelData.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
 
		XSSFSheet sheet1= wb.getSheetAt(0);
		
	  int rowcount=sheet1.getLastRowNum();
	  
	    System.out.println("total row count is "+rowcount);
	    
	    for (int i=0;i<rowcount;i++) 
	    
	    {
	    
	    	
	  String data0= sheet1.getRow(i).getCell(0).getStringCellValue();
	  String data1= sheet1.getRow(i).getCell(1).getStringCellValue();
	   
	   System.out.println("Test Data from excel is "+data0);
	   System.out.println("Test Data from excel is "+data1);
	    
	        	
	    }
		
		
	  wb.close();
	
	}

}







