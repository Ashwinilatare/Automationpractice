package Assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class orangehrm {

	public static void main(String[] args ) {
		//open chrome browser
		WebDriver driver = setUp("chrome");
		// enter application url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// print page title
		System.out.println("Login page title: " + driver.getTitle());
		// enter user name
		/*first identify required element from the application open on the browser
		WebElement userNameInputField=driver.findElement(By.id(""));
													.name("")
													 .linkText("")
													 .partialLinkText("")
													 .className("")
													 .tagName("")
													 .cssSelector("")
													 .xpath("")
		*/
		WebElement userNameInputField=driver.findElement(By.name("username"));
		
		/*Once you identify the element from the browser perform required action on it 
			type					---> userNameInputField.sendKeys("admin");
			click					---> userNameInputField.click();
			delete existing text	---> userNameInputField.clear();
		 */
		userNameInputField.sendKeys("Admin");
		
		//enter password
		WebElement passwordInputField=driver.findElement(By.name("password"));
		passwordInputField.sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.className("orangehrm-login-button")).click();	
		//	loginButton.click();
				//or
		//driver.findElement(By.id("login-button")).click();
		
		//close browser
		//driver.close();
	}

	public static WebDriver setUp(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			/* 2. After setting the path of driver executable, create an instance of required browser */
			return new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new InternetExplorerDriver();
		}
		return null;
	}


	}


