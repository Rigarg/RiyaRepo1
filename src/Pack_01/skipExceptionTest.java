package Pack_01;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipExceptionTest {
	
  @Test
  public void f() {
	  int a=2;
	  if(a==2) {
		  System.out.println("This line will be printed before skip exception");
		  throw new SkipException("Skipping - This is not ready for testing ");
	  }
	   
  }
}
