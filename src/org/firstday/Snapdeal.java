package org.firstday;


	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Snapdeal {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Debajit\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.snapdeal.com/");
			driver.manage().window().maximize();
			
			WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
			txtSearch. sendKeys("iPhone7");
			WebElement btnSearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
			btnSearch.click();
			WebElement iPhone = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black']"));
			iPhone.click();
			
			String Par = driver.getWindowHandle();
			Set<String> All = driver.getWindowHandles();
			System.out.println(Par);
			System.out.println(All);
			
			for (String x : All) {
				if (!Par.equals(x)) {
					driver.switchTo().window(x);
					
//					TakeScreenshot sc = (TakeScreenshot) driver;
//					File src = sc.getScreenshotAs (OutputType.FILE);
//					File dst = new File (C:\\Users\\Debajit\\eclipse-workspace\\Sep10amBatch\\Sample.png);
//					
//					FileUtils.copyFile(src, dst);
//					System.out.println("Done");
				}
			}
			
							
			WebElement Buy = driver.findElement(By.xpath("//span[text()='buy now']"));
			Buy.click();
		}
	}


}
