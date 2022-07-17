package Pack_01;

import org.testng.annotations.Test;

public class Dependencies {
	
  @Test(dependsOnMethods ={"Beforelogin", "Initialize"})
  public void Login() {
	  System.out.println("This was depend on login and Initialize method , so executing after that");
  }
  
  @Test
  public void Beforelogin() {
	  System.out.println("This is executed before 'login' method and first test in execution");
  }
  
  @Test
  public void Initialize() {
	  System.out.println("This is executed before 'login' method and second test in execution");
  }
  
  
}
