package Pack_01;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithSwitch {
	
	@DataProvider
	public Object[][] dataMethod (Method m){
		switch (m.getName()) {
		case "sum":
			return new Object[][] {{1,2}};
		case "sub":
			return new Object[][] {{3,2}};
					
		}
		return null;
		
	}	
	
  @Test(dataProvider="dataMethod")
  public void sum(int a, int b ) {
	  
	  System.out.println(a+b);
  }
  
  @Test(dataProvider="dataMethod")
  public void sub(int a, int b ) {
	  
	  System.out.println(a+b);
  }
}
