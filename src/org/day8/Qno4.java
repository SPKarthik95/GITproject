package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\Day8Task\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		Alert al=driver.switchTo().alert();
		al.accept();
	    WebElement cont= driver.findElement(By.xpath("//input[@class='btn btn-default']"));
	    Thread.sleep(3000);
		cont.click();
}
}