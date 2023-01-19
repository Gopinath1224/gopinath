package Test_ng;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Enabled {

	// public static void main(String[] args) {
		
	@Test	
	
	public void signup() {
		System.out.println("signup");
			
	}
	
	@Test (enabled = false,alwaysRun = true)
	public void login() {
	      System.out.println("login");
	      
	      throw new NoSuchElementException("Element is not present");
	      
	}
	
	@Test(dependsOnMethods = "login")
	public void searchproduct() {
		System.out.println("searchproduct");
	}
	
	@Test(priority = 1)
	public void addtocard() {
		System.out.println("Add to card");
		
	}
	@Test(priority = 2)
	public void checkout() {
		System.out.println("checkout");
		
	}
	@Test(priority = 3)
	public void singout() {
		System.out.println("signout");
			
	}
	}
	



