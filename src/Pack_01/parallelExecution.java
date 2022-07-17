package Pack_01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelExecution {
  @Test
  public void firefox() {
		System.setProperty("webdriver.gecko.driver", "D:\\EclipseSeleniumWorkspace\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
  }
  
  @Test
  public void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseSeleniumWorkspace\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.quit();
  }
  
}
