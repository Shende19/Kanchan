package testngprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationProgram3 {
  @Test(priority=2)
  public void verifyLogin() {
	  System.out.println("login is successful");
  }
  @BeforeMethod
  public void browserOpen() {
	  System.out.println("open the browser and entered url");
  }
  @Test(priority=1)
  public void verifyLogout() {
	  System.out.println("logout is successful");
  }
  @AfterMethod
  public void browserClose() {
	  System.out.println("close the current instance");
  }

  @BeforeTest
  public void login() {
	  System.out.println("enter url before login ");
  }

  @AfterTest
  public void logout() {
	  System.out.println("closed url after logout");
  }

}
