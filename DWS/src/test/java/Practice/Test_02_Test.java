package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_02_Test {
	@Test

	public void launch() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/");
Thread.sleep(3000);	
driver.quit();
	}
	}
