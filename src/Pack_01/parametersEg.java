package Pack_01;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersEg {
	
  @Test
  @Parameters({"a" , "b"})
  public void login(String A , String B) {
	  System.out.println(A+" value for a");
	  System.out.println(B+" value for b");
  }
}
