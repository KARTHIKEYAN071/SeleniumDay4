package demo.pracWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise1 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
//		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement Firstname=driver.findElement(By.id("input-firstname"));
		Firstname.sendKeys("Karthi");
		WebElement Lastname=driver.findElement(By.id("input-lastname"));
		Lastname.sendKeys("R");
		WebElement Email=driver.findElement(By.id("input-email"));
		Email.sendKeys("karthi123@gmail.com");
		WebElement Password=driver.findElement(By.id("input-password"));
		Password.sendKeys("Karthi@2004");
		
		WebElement yesbutton=driver.findElement(By.id("input-newsletter-yes"));
		yesbutton.click();
		
	}
}
