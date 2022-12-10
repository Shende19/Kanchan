package testngprogram;

import org.testng.annotations.Test;

public class ParameterExample {
  @Test(priority=1)
  public void login() {
	  System.out.println("login the email page");
  }
  @Test(priority=2)
  public void sendemail() {
	  System.out.println("send the mail");
  }
  @Test(priority=3)
  public void logout() {
	  System.out.println("logout the mail");
  }
}
