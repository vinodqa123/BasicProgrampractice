import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\Vinod\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.google.com");
	}
}
