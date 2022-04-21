package org.test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task57 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium 2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement clc =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		clc.click();
		Thread.sleep(3000);
		List<WebElement> op =driver.findElements(By.xpath("//select[@id='month']//option"));
		//System.out.println(op.size());
		for (int i =0; i < op.size(); i=i+2) {
			System.out.println(op.get(i).getText());	
		}
		
	}
}
