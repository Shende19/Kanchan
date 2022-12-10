package testngprogram;

import org.testng.annotations.Test;

public class ParameterExample7 {
  @Test( enabled=true)
  public void login() {
	  System.out.println("log in the browser");
  }
  @Test(dependsOnMethods="login" , enabled=true ,timeOut=2000)
  public void  checknotification() {
	  System.out.println("log in the browser");
	  try {
		  Thread.sleep(900);
	  }
	  catch(InterruptedException e) {
	  e.printStackTrace();
	  }
  }
}
  



//if we did not provide time between given interval then it shows timeoutexception
