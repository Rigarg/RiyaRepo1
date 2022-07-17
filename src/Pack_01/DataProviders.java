package Pack_01;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
  @Test(dataProvider = "data")
  public void f(int a , int b , int c , int d , int e) {
	  System.out.println(a+b+c+d+e);
  }

  @DataProvider(name="data")
  public Object[][] dp() {
    return new Object[][] {
      //new Object[] 
    		  { 1,2,3,4,5 },{ 2,3,5,6,7 },{ 3,4,7,8,9 },
      
      
    };
  }
}
