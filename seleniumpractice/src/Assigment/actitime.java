package Assigment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class actitime {

	public static void main(String[] args) {
		WebDriver driver= setUp("chrome");
		driver.get("https://demo.actitime.com/");
		String expectedURL= "https://demo.actitime.com/";
		String actualURL =driver.getCurrentUrl();
		String PageTitle = driver.getTitle();
		int TitleLength = PageTitle.length();
		System.out.println("Page Title: " + PageTitle);
		System.out.println("TitleLength:"+ TitleLength);
		System.out.println("Result URL:"+ expectedURL);
		if (actualURL.contains(expectedURL))
		{
		
		System.out.println("Status: Pass");
		
		}
		else
		{ 
			System.out.println("Status: Fail");
		}

		
		String pageSourceCode=driver.getPageSource();
		//System.out.println("Source code: "+pageSourceCode);
		System.out.println("Page source length: "+pageSourceCode.length());
		//close opened browser
		driver.close();
	}
	
	public static WebDriver setUp(String browsername) {		
		if(browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new InternetExplorerDriver();
		}
		return null;
	}

	}


