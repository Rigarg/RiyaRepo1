package Pack_01;

import org.testng.annotations.Test;

public class PrioritiesSameAndAwithout {
	
  @Test(priority=1)
  public void Test1() {
	  System.out.println("This is first");

  }
  @Test(priority=1)
  public void Test2() {
	  System.out.println("This is second");
  }
  @Test(priority=1)
  public void Test3() {
	  System.out.println("This is third");
  }
  @Test(priority=0)
  public void Test4() {
	  System.out.println("This is fourth");
  }
  @Test
  public void Test5() {
	  System.out.println("This is before first");
  }
  @Test
  public void Test6() {
	  System.out.println("This is after first");
  }
}
