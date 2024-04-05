package Practice2;	

	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class Test_04_Test {
		@Test

		public void launch() throws InterruptedException {
		String url = System.getProperty("url");
			ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	Reporter.log("Practice2 script-02", true);
	driver.quit();
		}
		}


