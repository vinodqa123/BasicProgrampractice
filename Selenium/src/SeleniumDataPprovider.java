import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class SeleniumDataPprovider {
	
	
	@BeforeClass
	 public static void testGuru99TakeScreenShot() throws Exception{

			WebDriver driver ;
	    	System.setProperty("webdriver.chrome.driver","D:\\Vinod\\Eclipse\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();

	        //goto url

	        driver.get("https://www.google.com/");
	        
	        driver.findElement(By.linkText("Sign in")).click();
	        
	        //Call take screenshot function

	        
	}


}
