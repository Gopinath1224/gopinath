package Test_ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {
	
	@Test(threadPoolSize=2, invocationCount=3)
	public void launchGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
	}

	
}

