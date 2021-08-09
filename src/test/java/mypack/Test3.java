package mypack;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3
{
	public static void main(String[] args)
	{
		//Hide browser and launch site
		WebDriverManager.firefoxdriver().setup();
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"E:\\geckologs.txt");
		FirefoxOptions fo=new FirefoxOptions();
		fo.setHeadless(true);
		FirefoxDriver driver=new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();
	}
}
