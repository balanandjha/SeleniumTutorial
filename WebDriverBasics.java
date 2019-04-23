package SeleniumNaveenLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//1.Launch Firefox driver
		//gecoDriver
		//System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		
		driver.get("http://www.google.com");//enter url
		String title=driver.getTitle();//returning the title
		System.out.println(title);
		//driver.switchTo().frame("classFrame");
		if (title.equals("Google")){
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect title");
			
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();//quit the browser
		
	}

}
