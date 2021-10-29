

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");
		///html/body/div[2]/form/p[1]/label[2]/input
		//*[@id="no"]
		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();
		//driver.findElement(By.xpath("//input[@id='no']")).click();
		//driver.findElement(By.xpath("//*[@id='no']")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/form/p[1]/label[2]/input")).click();
		
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();



	}

}
