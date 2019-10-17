package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\Day8Task\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
	    WebElement cont= driver.findElement(By.xpath("//a[contains(text(),'CONTINUE TO LOGIN')]"));
		cont.click();
		WebElement logIn= driver.findElement(By.xpath("//input[@id='Button2']"));
		logIn.click();
		Alert al= driver.switchTo().alert();
		al.accept();
}
}