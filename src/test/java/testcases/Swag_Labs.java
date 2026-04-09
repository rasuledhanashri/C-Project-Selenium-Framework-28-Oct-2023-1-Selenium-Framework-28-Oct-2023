package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Labs {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys("secret_sauce");
		
		WebElement Login = driver.findElement(By.xpath("//input[@name='login-button']"));
		
		Login.click();
		
		// Products 
		
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		
		for (WebElement webElement : product) {
			
			System.out.println(webElement.getText());
			
		}
		
		
		List<WebElement> addtoCart = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
		
		
		for (WebElement webElement : addtoCart) {
			
			webElement.click();
			
		}
		
	}

}
