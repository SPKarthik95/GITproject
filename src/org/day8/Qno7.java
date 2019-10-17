package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\Day8Task\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/");
	    WebElement sIn= driver.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]"));
	    Thread.sleep(3000);
		sIn.click();
		WebElement submit= driver.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]"));
		Thread.sleep(3000);
		submit.click();	
		WebElement uName= driver.findElement(By.xpath("//input[@id='input_0']"));
		uName.sendKeys("SP_KARTHIK");
		WebElement pass= driver.findElement(By.xpath("//input[@id='input_1']"));
		pass.sendKeys("123456789");

}
}