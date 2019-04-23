package SeleniumNaveenLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		driver.get("http://www.spicejet.com/");
		
		driver.manage().window().maximize();//maximizing the window
		driver.manage().deleteAllCookies();//deleting all the cookies
		
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Fleet")).click();
	

}
}
