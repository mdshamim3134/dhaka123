import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shamim");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
