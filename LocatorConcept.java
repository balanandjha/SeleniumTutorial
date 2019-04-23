package SeleniumNaveenLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		
		driver.get("https://reg.ebay.com/reg/PartialReg?_trksid=m570.l2621");//enter url
		
		//XPATH 8 xpath in selenium
		//driver.findElement(By.xpath("//INPUT[@id='firstname']")).sendKeys("Balanand");
		driver.findElement(By.id("firstname")).sendKeys("Balanand");//id
		//driver.findElement(By.name("email")).sendKeys("BJha@gmail.com");//name
		driver.findElement(By.xpath("//INPUT[@id='lastname']")).sendKeys("Jha");
		
		//driver.findElement(By.linkText("Sign in")).click();//link text 
		//partial link text
		
		//css selector
		driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("12345");
		//class name : not recommended to use 
		driver.findElement(By.className(" wide fld regular-text bold-text float-box")).sendKeys("Bjha1@gmail.com");
		
	}

}
