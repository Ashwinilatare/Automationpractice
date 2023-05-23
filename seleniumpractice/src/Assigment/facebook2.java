package Assigment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class facebook2 {
	
	static WebDriver driver;

		public static void main(String[] args) {
			setUp("chrome");
			driver.get("https://www.facebook.com");
			String Resultstring = driver.getTitle();
			String Actualstring = "Facebookv Login";
			if(Actualstring.equals(Resultstring))
			{
				System.out.println("Status = Pass");
			}
			else
			{
				System.out.println("Status = fail");	
			}
			System.out.println("Page Title is :- "+ driver.getTitle());
			driver.close();

		}
		public static void setUp(String browserName) {
			
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}

	
	}


