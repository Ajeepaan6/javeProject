package org.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task59 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium 2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement clc =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		clc.click();
		Thread.sleep(3000);
		WebElement dtd=driver.findElement(By.id("month"));
		Select s=new Select(dtd);
		System.out.println("=========Check Duplicate========");
		List<WebElement>allopt=s.getOptions();
		for (int i =0; i < allopt.size(); i++) {
			for(int j=i+1; j < allopt.size(); j++ ) {
				if(i==j) {
			System.out.println(allopt.get(j).getText());	
		}
			}
		}
}
}
