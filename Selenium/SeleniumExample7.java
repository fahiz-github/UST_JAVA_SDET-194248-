	import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumExample7 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();	
		String baseUrl = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";					

      //*[@id="content"]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/a/svg 		
        driver.get(baseUrl);					
        //click on the "Facebook" logo on the upper left portion		
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/div[3]/div/div/div[1]/div/span/span")).click();
			//verify that we are now back on Facebook's homepage	
        System.out.println(driver.getTitle());
			if (driver.getTitle().equals("Log in to Facebook")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
				driver.close();	
				



	}

}
