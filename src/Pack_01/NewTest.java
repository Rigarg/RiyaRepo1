package Pack_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\EclipseSeleniumWorkspace\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.get("https://www.google.com");
  	  //Capturing the title and validating if expected is equal to actual
  	  String expectedTitle = "Google";
  	  String actualTitle = driver.getTitle();
  	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeMethod
  public void ABc() {
	  
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
