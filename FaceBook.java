package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manoj Kumar");
		driver.findElement(By.name("lastname")).sendKeys("Surishetty");
		driver.findElement(By.name("reg_email__")).sendKeys("712345696");
		driver.findElement(By.id("password_step_input")).sendKeys("xy@1234");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("4");
		Select Month = new Select(driver.findElement(By.id("month")));
		Month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1991");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
	}



	}


