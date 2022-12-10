package testngprogram;

import org.testng.annotations.Test;

public class InvocationCountProgram {
  @Test(invocationCount =5)
  public void param1 () {
	  System.out.println("hello , I am TC1 from param1 class");
  }
}

//if we want to run same method multiple time then testng provide invocation count parameter
//it will increase the count of method
//by using for loop in java we can run the logic of program in multiple time but does not run method multiple time