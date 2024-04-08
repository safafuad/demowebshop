package GitHubPull;


	import org.openqa.selenium.chrome.ChromeDriver;
	

	public class Pull {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			

			driver.get("https://demowebshop.tricentis.com/login");
						Thread.sleep(4000);
			
			driver.quit();


		}

	}

