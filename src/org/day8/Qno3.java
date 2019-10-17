package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qno3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\Day8Task\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.switchTo().frame("login_page");
		WebElement cont= driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		cont.click();
		Alert al= driver.switchTo().alert();
		al.accept();
}
}
