import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileTest {
	
	static Properties prop;
	static File file;
	static FileReader reader;
	static String configfilePath="D:\\Vinod\\Eclipse\\Data\\Configuration.properties";
	
	public static void loadData() throws IOException {
		prop=new Properties();
		FileInputStream ip= new FileInputStream(configfilePath);		
		prop.load(ip);	
		
		System.out.println("Loaded Successfully");
		
	}
	
	public static void getData() {
		
		System.out.println(prop.getProperty("firstname"));
		
		System.out.println(prop.getProperty("lastname"));		
			
	}
	
	public static void main(String[] args) throws IOException {
		loadData();
		getData();
		
	}

	
	
}
