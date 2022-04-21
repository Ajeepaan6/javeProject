package org.test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task58 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium 2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement clc =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		clc.click();
		Thread.sleep(3000);
		System.out.println("==========Days============");
		List<WebElement> day =driver.findElements(By.xpath("//select[@id='day']//option"));
		for (int i =0; i < day.size(); i++) {
			System.out.println(day.get(i).getText());	
		}
		System.out.println("==========Months============");
		List<WebElement> month =driver.findElements(By.xpath("//select[@id='month']//option"));
		for (int i =0; i < month.size(); i++) {
			System.out.println(month.get(i).getText());	
		}
		System.out.println("==========Year============");
		List<WebElement> year =driver.findElements(By.xpath("//select[@id='year']//option"));
		for (int i =0; i < year.size(); i++) {
			System.out.println(year.get(i).getText());	
		}
	}
}
