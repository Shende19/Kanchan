package testngprogram;

import org.testng.annotations.Test;

public class ParameterExample5 {
  @Test(dependsOnMethods="signin", enabled=true)
  public void login() {
	  System.out.println("login to the webpage");
  }
  @Test(dependsOnMethods="login" , enabled=true)
  public void checknotification() {
	  System.out.println("after sign to the webpage check notification");
  }
  @Test(enabled=true)
  public void signin() {
	  System.out.println(" sign-in to the webpage");
	  int i=10/0;
  }
}
