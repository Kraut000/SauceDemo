package Saucedemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Downloads\\Sauce-master\\SauceFinal\\Browser\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.saucedemo.com/");
						
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();

				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[1]")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7\"])[5]")).click();
				
				driver.quit();
	}

}
