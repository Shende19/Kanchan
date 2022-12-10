package testngprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationProgram1 {
  @BeforeTest
  public void openBrowser() {
	  System.out.println("chrome browser open and url is entered");
  }
  @Test(priority=1)
  public void verifyLogin() {
	  System.out.println("Successfully login");
  }

  @Test(priority=2)
  public void createTask() {
	  System.out.println("Task created successfully");
  }

  @AfterTest
  public void closeBrowser() {
	  System.out.println("Browser instance is close");
  }
}

//@beforetest annotation is used  on the behalf of @test method means for the common functionality for @TestMethod
//it is test case prerequisite which is used before test case  start thats why we used  @beforetest method
