package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium 2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement sur= driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
	WebElement des= driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
	
	WebElement sur1= driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
	WebElement des1= driver.findElement(By.xpath("//ol[@id='amt7']"));
	
	WebElement sur2= driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
	WebElement des2= driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
	
	WebElement sur3= driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
	WebElement des3= driver.findElement(By.xpath("//ol[@id='amt8']"));
	Actions actions=new Actions(driver);
	
	actions.dragAndDrop(sur,des).perform();
	actions.dragAndDrop(sur1,des1).perform();
	actions.dragAndDrop(sur2,des2).perform();
	actions.dragAndDrop(sur3,des3).perform();
	WebElement sur4= driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
	String s=sur4.getText();
	System.out.println(s);
	
}
}
