package base;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClassOfProject {
	
	public static WebDriver driver;
	Properties Pro = new Properties();
	public Properties loc = new Properties();
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver == null) {
			FileReader ip= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			Pro.load(ip);
			FileReader L= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\Locator.properties");
			loc.load(L);
		}

		
		if(Pro.getProperty("browser").equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(Pro.getProperty("testurl"));
		}
		else if(Pro.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(Pro.getProperty("testurl"));
			
			
		}
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
