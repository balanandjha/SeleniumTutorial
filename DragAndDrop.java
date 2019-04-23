package SeleniumNaveenLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();//maximizing the window
		driver.manage().deleteAllCookies();//deleting all the cookies
		
		driver.switchTo().frame(0);
		//drag and drop functionality
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(By.xpath("//P[text()='Drag me to my target']")))
		.moveToElement(driver.findElement(By.xpath("//DIV[@id='droppable']")))
		.release()
		.build()
		.perform();
		
		
		

	}

}
