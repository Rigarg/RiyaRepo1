package Pack_01;

import org.testng.annotations.Test;

public class GroupsAndDependsOnGroups {
  @Test(groups= {"A" ,"B"})
  public void Test1() {
	  System.out.println("This is part of group A and B with Test1");
  }
  
  @Test(groups= {"A" ,"B"})
  public void Test2() {
	  System.out.println("This is part of group A and B with Test2");
  }
  @Test(groups= {"A"})
  public void Test3() {
	  System.out.println("This is part of group A with Test3");
  }
  @Test(groups= {"B"})
  public void Test4() {
	  System.out.println("This is part of group B with Test4");
  }
  
  @Test(dependsOnGroups= {"A" ,"B"})
  public void Test5() {
	  System.out.println("This is depending on group A and B");
  }
  
}
