package SeleniumNaveenLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		
		
		driver.manage().window().maximize();//maximizing the window
		driver.manage().deleteAllCookies();
		//dymamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.half.ebay.com/");
		driver.findElement(By.xpath("//input[@class='actextbook']")).sendKeys("Java");
		/*
		 * customized xpath 1. Type (input type ) 
		 * 2. next element is class : (@class =<name of the class>
		 * or we can elnter any element but inthe format of 
		 * [@inputType='value']
		 * eg: (By.xpath("//input[@name='query']"))
		 */
		driver.findElement(By.xpath("//input[@name='query']")).sendKeys("Java");
		
		//using contains
		driver.findElement(By.xpath("//input[contains(@id,'actextbook')]")).sendKeys("Java");
		
		//dynamics id (handling dynamic ids)
		
		driver.findElement(By.xpath("//input[contains(@id,'Test_')]")).sendKeys("java");
		
		//startswith
		
		driver.findElement(By.xpath("//input[starts-with(@id,'Test_')]")).sendKeys("Java");
		
		//endswith
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_']")).sendKeys("Java");
		
		//customized xpath for links
		//all the links are represented as <a> tah in html
		driver.findElement(By.xpath("//a[contains(text(),'Myaccount')]")).click();
		
		/* benefits of customized xpath
		 * 1. perfomance is good
		 * 2.can't change likenormal xpath
		 * it's relialabe
		 * 
		 */
		 
		
		

	}

}
