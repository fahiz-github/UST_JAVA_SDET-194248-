package com.ust.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestSample {
	
WebDriver d ;
	
	@BeforeTest

	
	public void checkWebsite() {
        System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");					
        d = new ChromeDriver();
        d.navigate().to("https://www.google.co.in/");
	}
	
	//*[@id="yDmH0d"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button

	
	
  @Test
  public void f() {
	  d.findElement(By.name("q")).sendKeys("Weather");
	  //d.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();

	  //d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
  }
}
