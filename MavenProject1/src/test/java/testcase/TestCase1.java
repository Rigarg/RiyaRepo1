package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.baseClassOfProject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 extends baseClassOfProject{

	public static void main(String[] args) throws InterruptedException {
		
		WebElement signIn=driver.findElement(By.linkText("Sign in"));
		signIn.click();
		WebElement id= driver.findElement(By.id("nextbtn"));
		id.click();
//		WebDriverWait W= new WebDriverWait(driver, Duration.ofSeconds(2));
//		W.until(ExpectedConditions.visibilityOf(id));
		WebElement email= driver.findElement(By.id("login_id"));
		email.sendKeys("riya.garg0607@gmail.com");
		id.click();
		WebElement signInButton= driver.findElement(By.xpath("//button//span[contains(text(),'Sign in')]"));
//		WebDriverWait W1= new WebDriverWait(driver, Duration.ofSeconds(2));
//		W1.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("Riya#0607");
//		WebDriverWait W3= new WebDriverWait(driver, Duration.ofSeconds(2));
//		W3.until(ExpectedConditions.elementToBeClickable(signInButton));
		signInButton.click();
//		
		
		
		
		
		
		
		

	}

}
