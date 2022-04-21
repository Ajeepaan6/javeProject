package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium 2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement textus=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		textus.click();
		Thread.sleep(3000);
		
		WebElement text2=driver.findElement(By.xpath("//a[@class='analystic']"));
		text2.click();
		WebElement text3=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		text3.click();
		WebElement text4=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		text4.click();
		WebElement text5=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		text5.click();
		Alert alert=driver.switchTo().alert();
		//alert.sendKeys("Ajeepann");
		System.out.println(alert.getText());
		alert.accept();
}
}