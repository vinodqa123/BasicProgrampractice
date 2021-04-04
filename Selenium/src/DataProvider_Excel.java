import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;

public class DataProvider_Excel {
	
	public static DataFormatter formatter= new DataFormatter();
	Object data[][];
	@Test(dataProvider="TestData")	
	public void LoginFun(String Fname,String Lname) {
		
		System.out.println(Fname);
		System.out.println(Lname);				
	}
	
	@DataProvider(name="TestData")
	public  Object[][] logindata() throws IOException {
		
		
		 File file=new File("D:\\Vinod\\Eclipse\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(file);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet=wb.getSheetAt(0);
		 
		 int rowcount=sheet.getLastRowNum();
		 System.out.println(rowcount); 
		 data=new Object[3][2];
		 for(int i=0;i<3;i++) {
			 
			XSSFRow row = sheet.getRow(i);
			int colcont=row.getLastCellNum();
			 for(int j=0;j<2;j++) {
				XSSFCell cell= row.getCell(j);
				String value=formatter.formatCellValue(cell);
                data[i][j]=value;                                 
             }
		 }
		 		
	return data;
		
	}
	
}
