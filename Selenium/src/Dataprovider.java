import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider="TestData")
	
	public void LoginFun(String Fname,String Lname) {
		
		System.out.println(Fname);
		System.out.println(Lname);
				
	}
	
	@DataProvider(name="TestData")
	public  Object[][] logindata() {
		Object data[][]=new Object[3][2];
		
		 data[0][0]="Vinod";
		 data[0][1]="Jadhav";
		 data[1][0]="Vishal";
		 data[1][1]="Jadhav";
		 data[2][0]="Amar";
		 data[2][1]="Jadhav";
		 		
		return data;
		
	}
		
		
	
	
}