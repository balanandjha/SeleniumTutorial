package SeleniumNaveenLabs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balanand.jha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		driver.get("//Somewebsite which has alert box");
		driver.findElement(By.name("Register")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if (text.equals("Please Enter a value in username")) {
			System.out.println("Alert message is correct");
	
		} else {
			System.out.println("alert message mismatch");
		}
		
		alert.accept();//click on ok button
		alert.dismiss();//click on cancel button

	}

}
