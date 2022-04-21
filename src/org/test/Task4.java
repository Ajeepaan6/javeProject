package org.test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Task4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium Task\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ajitkumar\\Desktop\\Task\\img.png");
		FileUtils.copyFile(src, des);
		WebElement box=driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		File src1=box.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\Ajitkumar\\Desktop\\Task\\img2.png");
		FileHandler.copy(src1, des1);
}
}