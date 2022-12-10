package testngprogram;

import org.testng.annotations.Test;

public class ParameterExample6 {
  @Test(dependsOnMethods="signin" ,enabled=true)
  public void login( ) {
	  System.out.println("login the page");
  }
  @Test(dependsOnMethods="login" , enabled=true)
  public void  checknotification() {
	  System.out.println("check notification of the page");
  }
  @Test(enabled=true , expectedExceptions=ArithmeticException.class)
  public void signin() {
	  System.out.println("sign  the page");
	  int i=10/0;
  }
  
}
