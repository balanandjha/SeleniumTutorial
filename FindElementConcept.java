package SeleniumNaveenLabs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		
		
		driver.manage().window().maximize();//maximizing the window
		driver.manage().deleteAllCookies();
		//dymamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		//get the total count of link
		//get the text of each link on the page
		//all links are represented by <a>
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linklist
		System.out.println(linkList.size());
		
		for (int i = 0; i < linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
			
		}

	}

}
