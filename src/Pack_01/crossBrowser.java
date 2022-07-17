package Pack_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {
	
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void f(String browser) {
	  if(browser =="chrome") {
		  System.out.println("Chrome run");
		  System.setProperty("webdriver.chrome.driver", "D:\\EclipseSeleniumWorkspace\\chromedriver.exe");	
		  driver= new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  }
	  
	  if(browser == "firefox") {
		  System.out.println("firefox run");
		  System.setProperty("webdriver.gecko.driver", "D:\\EclipseSeleniumWorkspace\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  
	  }
  }
}
