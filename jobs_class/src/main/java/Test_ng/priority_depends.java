package Test_ng;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class priority_depends {

	// public static void main(String[] args) {
		
	@Test	
	
	public void signup() {
		System.out.println("signup");
			
	}
	
	@Test(dependsOnMethods="signup")
	public void login() {
	      System.out.println("login");
	      
	}
	
	@Test(priority=4)
	public void searchproduct() {
		System.out.println("searchproduct");
	}
	
	@Test(priority=2)
	public void addtocard() {
		System.out.println("Add to card");
		
	}
	@Test(priority=3)
	public void checkout() {
		System.out.println("checkout");
		
	}
	@Test(priority=1)
	public void singout() {
		System.out.println("signout");
			
	}
	}
	



