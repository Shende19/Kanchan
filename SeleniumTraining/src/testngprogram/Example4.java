package testngprogram;

import org.testng.annotations.Test;

public class Example4 {
	@Test(priority-1)
	public void login() {
	System.out.println("log in to the mail");
	}
	@Test(priority-3)
	public void sendemail() {
	System.out.println("send email");
	}
	@Test(priority-2)
	public void logout() {
	System.out.println("logout the email");
	}
	
	
}
