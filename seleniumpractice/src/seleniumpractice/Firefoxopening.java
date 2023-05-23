package seleniumpractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxopening {

	public static void main(String[] args) {
	
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.gecko.driver","C:\\Automation sessions\\Workspace\\seleniumpractice\\executables\\geckodriver.exe");
					//or
			//System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
					//or
			//String driverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
			//System.setProperty("webdriver.gecko.driver", driverPath);
			/*2. After setting the path of driver executable, create an instance of required browser*/
			FirefoxDriver cdriver=new FirefoxDriver();
		}
	


	}


