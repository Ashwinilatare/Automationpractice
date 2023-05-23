package Assigment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class executeautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver = setUp("chrome");
				driver.get("https://demosite.executeautomation.com/Login.html");
				String expectedUrl = "https://demosite.executeautomation.com/Login.html";
				String ActualUrl = driver.getCurrentUrl();
				
				System.out.println("Page Title :- "+ driver.getTitle());
				System.out.println("Page Title :- "+ driver.getTitle().length());
				
				if(ActualUrl.contains(expectedUrl))
				{
					System.out.println("Status Pass");
				}
				else
				{
					System.out.println("Status Fail");
				}
			
				driver.findElement(By.name("UserName")).sendKeys("execution");
				driver.findElement(By.name("Password")).sendKeys("admin");			//  having issue on button
			//driver.findElement(By.tagName("input").name("Login")).click();
			}
			public static WebDriver setUp(String browsername) {		
				if(browsername.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
					return new ChromeDriver();
				}else if(browsername.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
					return new FirefoxDriver();
				}else if(browsername.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
					return new InternetExplorerDriver();
				}
				return null;
			}
		
	}


