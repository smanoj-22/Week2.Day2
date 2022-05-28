package week2.day2;

import org.omg.PortableServer.POAManagerPackage.State;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()= 'Contacts']")).click();
		driver.findElement(By.xpath("//a[text()= 'Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sai");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Chinna");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.name("description")).sendKeys("I am an Software Test Engineer");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("manoj$122@gmail.com");
	    Select State = new Select (driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
	    State.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.xpath("//a[text()= 'Edit']")).click();
	    driver.findElement(By.xpath("//textarea[text()= 'I am an Software Test Engineer']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Please Enter active Email id");
		driver.findElement(By.xpath("//input[@value= 'Update']")).click();
		String Result= driver.getTitle();
		System.out.println(Result);
	}

}
