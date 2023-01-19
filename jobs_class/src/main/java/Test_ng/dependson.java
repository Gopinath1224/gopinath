package Test_ng;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class dependson {

	// public static void main(String[] args) {
		
	@Test	
	
	public void signup() {
		System.out.println("singup");
			
	}
	
	@Test(dependsOnMethods="signup")
	public void login() {
	      System.out.println("login");
	      
	}
	
	@Test(dependsOnMethods="login")
	public void searchproduct() {
		System.out.println("searchproduct");
	}
	
	@Test(dependsOnMethods="searchproduct")
	public void addtocard() {
		System.out.println("Add to card");
		
	}
	@Test(dependsOnMethods="addtocard")
	public void checkout() {
		System.out.println("check out");
		
	}
	@Test(dependsOnMethods="checkout")
	public void singout() {
		System.out.println("sing out");
			
	}
	}
	
	

//}


