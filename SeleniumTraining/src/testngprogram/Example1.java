package testngprogram;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void testcase3() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("Hi , I am TC3");
  }
}
