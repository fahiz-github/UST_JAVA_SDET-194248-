import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d ;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");					
      d = new ChromeDriver();
      d.get("http://demo.guru99.com/test/newtours/register.php");
      Assert.assertEquals(d.getTitle(), "Register: Mercury Tours");    
  }
  @Test
  public void f1() {
	  
		d.findElement(By.name("firstName")).sendKeys("Rahul");
		d.findElement(By.name("lastName")).sendKeys("cp");
		d.findElement(By.name("phone")).sendKeys("9995548785");
		d.findElement(By.name("userName")).sendKeys("Rahul1001");
		d.findElement(By.name("address1")).sendKeys("house no:12");
		d.findElement(By.name("city")).sendKeys("hampi");
		//d.findElement(By.name("firstName")).sendKeys("Rahul");
		d.findElement(By.name("state")).sendKeys("karnatka");
		d.findElement(By.name("postalCode")).sendKeys("673655");
		Select country = new Select(d.findElement(By.name("country")));
		country.selectByValue("INDIA");
		d.findElement(By.id("email")).sendKeys("rahul@gmail.com");
		d.findElement(By.name("password")).sendKeys("12345");
		d.findElement(By.name("confirmPassword")).sendKeys("12345");
		d.findElement(By.name("submit")).click();
		d.findElement(By.linkText("sign-in")).click();
		d.findElement(By.name("userName")).sendKeys("rahul@gmail.com");
		d.findElement(By.name("password")).sendKeys("12345");
		
		d.findElement(By.name("submit")).click();

	  
	  
  }
  
  
}
