package testngprogram;

import org.testng.annotations.Test;

public class Example2 {
  @Test
  public void testcase1() {
	  System.out.println("Hi, I am TC1");
  }
  
  @Test
  public void testcase2() {
	  System.out.println("Hi, I am TC2.....");
  }
  
}

//in java we cannot create more than one method in same class
//in testng we can create more thn one method in same class
//if it is happen in testng then execution will be in alphabetical order
//only @Test annotation method will get executed
