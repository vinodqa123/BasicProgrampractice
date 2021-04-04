import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDateExcel {
	
	 static int rowcount;
	 static Row row;
	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	 static String file="D:\\Vinod\\Eclipse\\Data\\TestData.xlsx";
	 static FileInputStream fis;
	 static FileOutputStream fos;
	 static String [] valueToWrite= {"Agriculture", "Engineer","Accountant","CA","H.S.C","S.S.C"};
	 
	 static int k=0;
	 
	 public static void writeDateExcel() throws IOException {
		 
		 		fis=new FileInputStream(file);			 
			
				workbook = new XSSFWorkbook(fis);
			 
				sheet= workbook.getSheetAt(0);
				
				rowcount = sheet.getLastRowNum();
		 
				 for(int i=1;i<=rowcount;i++) {
					 
					 row = sheet.getRow(i);
					 			 
					 sheet.getRow(i).createCell(2).setCellValue(valueToWrite[k]);
					 	
					 fos=new FileOutputStream(file);
			 		 
					 workbook.write(fos);
					 
					 System.out.println("Wrote Successfully: "+valueToWrite[k]);
					 
					 k++;
				 }				 
	 }
	 public static void main(String[] args) throws IOException {
		 writeDateExcel();
		 
	 }

}
