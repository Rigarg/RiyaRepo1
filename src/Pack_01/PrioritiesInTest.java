package Pack_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PrioritiesInTest {
  @Test(priority=2)
  public void Test1() {
	  System.out.println("This is executed seventh:@test1:Priority2");
	  
  }
  @Test(priority=1)
  public void Test2() {
	  System.out.println("This is executed fifth:@test2:Priority1");
	  
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is executed fourth(test1) and sixth(test2) and eighth(test");
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is executed third:3");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is executed second:2");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is executed first:1");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
