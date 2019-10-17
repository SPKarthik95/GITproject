package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\Day8Task\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement cookies= driver.findElement(By.xpath("//a[contains(text(),'ACCEPT')]"));
		Thread.sleep(3000);
		cookies.click();
		WebElement simple= driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]"));
		simple.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		WebElement confirm= driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]"));
		confirm.click();
		al.dismiss();
		Thread.sleep(3000);
		WebElement prompt= driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]"));
		prompt.click();
		al.accept();
	}

}
