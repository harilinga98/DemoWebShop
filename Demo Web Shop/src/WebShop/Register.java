package WebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	private static final WebElement Lastname = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" ,"C:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     //to maximize a window 
	     driver.manage().window().maximize();
	     	driver.findElement(By.linkText("Register")).click();
	     		driver.findElement(By.id("gender-female")).click();
	      //driver.findElement(By.id("gender-male")).click();
	      WebElement firstname = driver.findElement(By.id("FirstName"));
	      		firstname.sendKeys("Haripriya");
	     WebElement Lastname = driver.findElement(By.name("LastName"));
	      		Lastname.sendKeys("Lingapalem");
	      WebElement Email=driver.findElement(By.id("Email"));
	      		Email.sendKeys("haripriya24@gmail.com");
	      WebElement Password=driver.findElement(By.id("Password"));
	      		Password.sendKeys("Amma123");	
	      WebElement ConfirmPassword=driver.findElement(By.name("ConfirmPassword"));
	      		ConfirmPassword.sendKeys("Amma123");
	      driver.findElement(By.id("register-button")).click();
	      //driver.findElement(By.className("button-1 register-continue-button")).sendKeys(Keys.ENTER);
	     //Now logout
	      driver.findElement(By.linkText("Log out")).click();
	      
	      //Now i am writing the code to login 
	      driver.findElement(By.linkText("Log in")).click();
	      driver.findElement(By.name("Email")).sendKeys("haripriya12@gmail.com");
	      driver.findElement(By.name("Password")).sendKeys("Amma123");
	      driver.findElement(By.name("RememberMe")).click();
	      driver.findElement(By.className("button-1 login-button")).click();
	      
	      
	      
	      
		
	      
	    
	    }

}
