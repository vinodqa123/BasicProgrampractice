import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData{
	 static int rowcount;
	 static Row row;
	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	 static String file="D:\\Vinod\\Eclipse\\Data\\TestData.xlsx";
	 static FileInputStream fis;
	 static FileOutputStream fos;
	 
	public static void readWriteData() throws IOException {
				
		try {
		
		fis = new FileInputStream(file);
				
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		rowcount = sheet.getLastRowNum();
				 
		 for(int i=0;i<=rowcount;i++) {
			 		 
			row = sheet.getRow(i);
			 
			 int colcount=row.getLastCellNum();
			 
				
			 	 for(int j=0;j<colcount;j++) {
				 System.out.println("Row and column number is :"+i+"&"+j);
				 String cell = row.getCell(j).getStringCellValue();
				 
				 //System.out.println(cell);
				 System.out.println(cell);	
			 
			 	 }
			 		 			 
		 }	 
		 		
		 sheet = workbook.getSheetAt(0);
		 Row newRow = sheet.createRow(rowcount+1);
		 
		 String [] valueToWrite= {"Shubham","Jadhav"};
		 for(int j = 0; j < row.getLastCellNum(); j++){

		        //Fill data in row

		        Cell cell = newRow.createCell(j);

		        cell.setCellValue(valueToWrite[j]);
		    }
		 	fis.close();
		 	
	        fos = new FileOutputStream(file);

	        //write data in the excel file

	        workbook.write(fos);

	        //close output stream

	        fos.close();
	        
	        System.out.println("Data Stroed in Excel successfully");
		                        
	}catch(Exception e) {
		System.out.println("Exception Occured"+e);
	}
		
}		
	
	public static void main(String[] args) throws IOException {
		
		readWriteData();
	}
}
