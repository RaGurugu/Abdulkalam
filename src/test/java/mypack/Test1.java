package mypack;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test1
{
	public static void main(String[] args)
	{
		//Use headless browser and launch site
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://www.amazon.in");
		//Get title and display
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();
	}
}







