package SeleniumNaveenLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//load the chrome driver
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");//enter url
		
		driver.findElement(By.name("email")).sendKeys("b@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//DIV[@class='ui fluid large blue submit button'][text()='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("//name of the frame");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//some xpath")).click();
		
		driver.quit();
		
		
	}

}
