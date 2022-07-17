package Pack_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import graphql.Assert;

@Listeners(Pack_01.testlistener.class)
public class RunFailedTc {
	WebDriver driver;
	  @Test
	  public void Titlecheck() {
		  System.setProperty("webdriver.chrome.driver", "D:\\EclipseSeleniumWorkspace\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Actions a = new Actions(driver);
			WebElement Text=driver.findElement(By.id("twotabsearchtextbox"));
			a.moveToElement(Text).click().keyDown(Keys.SHIFT).sendKeys("green tea").build().perform();
			System.out.println("This is Action test method for sucessfull scenario");
	  }
	  
	  @Test
	  public void FailedTC() {
		  System.out.println("This is test method for unsucessfull scenario");
		  Assert.assertFalse(false);
		  
	  }
}
