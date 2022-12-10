package testngprogram;

import org.testng.annotations.Test;

public class ParameterExample2 {
  @Test(enabled=true)
  public void TC1() {
	  System.out.println("I am the example of TC1");
  }
  @Test(enabled=false)
  public void TC2() {
	  System.out.println("I am the example of TC2");
  }
  @Test(enabled=false)
  public void TC3() {
	  System.out.println("I am the example of TC3");
  }
  
}
