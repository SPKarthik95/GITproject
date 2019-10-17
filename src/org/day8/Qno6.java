package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\Day8Task\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sprint.com/");
	    WebElement sIn= driver.findElement(By.xpath("//p[contains(text(),'Sign In')]"));
		sIn.click();
		WebElement submit= driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		Thread.sleep(3000);
		submit.click();
		Alert al= driver.switchTo().alert();
		al.accept();
}
}
