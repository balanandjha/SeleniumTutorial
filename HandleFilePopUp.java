package SeleniumNaveenLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFilePopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		driver.get("https://html.com/input-type-file/");
		// For uploading file don't use click button, always use sendkeys
		driver.findElement(By.xpath("//INPUT[@id='fileupload']")).sendKeys("D:\\fsinnovation_frontend-master\\src\\company.html");
		driver.findElement(By.xpath("(//INPUT[@type='submit'])[1]")).submit();

	}

}
