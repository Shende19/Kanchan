package testngprogram;

import org.testng.annotations.Test;

public class MethodCallingProgram {
  @Test
  public void testCase7() {
	  displayDetails();
	  System.out.println("hi , I am tc1 from tetcase7");
  }
  
  @Test
  public void testCase8() {
	  displayDetails();
	  System.out.println("hi , I am tc1 from tetcase8");
  }
  
  void displayDetails() {
	  System.out.println("I am displaymethod from testcase8 example");
  }
  
  
  
  
}
