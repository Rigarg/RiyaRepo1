package Pack_01;

import org.testng.annotations.Test;

public class groups {
	  @Test(groups= {"unit" ,"integeration"})
	  public void Test1() {
		  System.out.println("This is part of group A and B with Test1");
	  }
	  
	  @Test(groups= {"unit"})
	  public void Test3() {
		  System.out.println("This is part of group A with Test3");
	  }
	  @Test(groups= {"integeration"})
	  public void Test4() {
		  System.out.println("This is part of group B with Test4");
	  }

}
