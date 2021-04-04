import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_WriteExcel {
	
	public static DataFormatter formatter= new DataFormatter();
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileOutputStream fos;
	Object data[][];
	
	@Test(dataProvider="TestData")	
	public void LoginFun(String Fname,String Lname) throws IOException {

		
	}
	
	@DataProvider(name="TestData")
	public  Object[][] logindata() throws IOException {
		
		 file=new File("D:\\Vinod\\Eclipse\\TestData.xlsx");
		 fis=new FileInputStream(file);
		 wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheetAt(0);
		 
		 int rowcount=sheet.getLastRowNum();
		 System.out.println(rowcount); 
		 data=new Object[3][2];
		 for(int i=0;i<rowcount+1;i++) {
			 
			XSSFRow row = sheet.getRow(i);
			int colcont=row.getLastCellNum();
			 for(int j=0;j<colcont;j++) {
				XSSFCell cell= row.getCell(j);
				String value=formatter.formatCellValue(cell);
                data[i][j]=value; 
                sheet.getRow(i).createCell(2).setCellValue("Pass");
                fis.close();
                fos=new FileOutputStream(file);
                wb.write(fos);
                
             }
			 
			 
		 }
		 
		 		
	return data;
		
	}

}
