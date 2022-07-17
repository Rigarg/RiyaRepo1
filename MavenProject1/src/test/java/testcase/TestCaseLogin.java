package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.baseClassOfProject;

public class TestCaseLogin extends baseClassOfProject{
	
	
	@Test
	public void login() {
		WebElement signIn=driver.findElement(By.linkText(loc.getProperty("signIn.linkText")));
		signIn.click();
		WebElement id= driver.findElement(By.id(loc.getProperty("nextButton.ID")));
		id.click();
		WebElement email= driver.findElement(By.id(loc.getProperty("LoginID.ID")));//
		email.sendKeys("riya.garg0607@gmail.com");
		id.click();
		WebElement signInButton= driver.findElement(By.xpath(loc.getProperty("SignINButton.Xpath")));
		signInButton.click();
		WebDriverWait W1= new WebDriverWait(driver, Duration.ofSeconds(2));
		W1.until(ExpectedConditions.visibilityOf(signInButton));
		WebElement password= driver.findElement(By.id(loc.getProperty("password.ID")));
		password.sendKeys("Riya#0607");
		WebDriverWait W3= new WebDriverWait(driver, Duration.ofSeconds(2));
		W3.until(ExpectedConditions.elementToBeClickable(signInButton));
		signInButton.click();
		
	}

}
