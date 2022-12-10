package testngprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationProgram2 {
  @BeforeMethod
  public void openBrowser() {
	  System.out.println("open Browser and entered url");
  }
  @Test
  public void verifyLogin () {
	  System.out.println("log in is successful");
  }
  @Test
  public void createTask() {
	  System.out.println("task is created");
  }
  @AfterMethod
  public void closeBrowser() {
	  System.out.println("close the current instance");
  }

}

//this annotation is used before every test case executed and after every test case is executed
