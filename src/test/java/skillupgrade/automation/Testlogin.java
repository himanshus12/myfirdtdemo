package skillupgrade.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("userEmail");
		driver.findElement(By.id("userPassword")).sendKeys("April!2022");
		driver.findElement(By.id("login")).click();
		
		

	}

}
