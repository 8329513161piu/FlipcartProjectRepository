package Utility;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation
{
	public static WebDriver driver=null;
	public static Hashtable <String,Object> outputparameters=new Hashtable<String,Object>();
	//BrowserLaunch
	public static Hashtable <String,Object> browserLanch(Object[]inputParameters)
	{
		try 
		{
		String strBrowserName=(String) inputParameters[0];
		String webDriverExe=(String) inputParameters[1];
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",webDriverExe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if(strBrowserName.equalsIgnoreCase("Firefox"))
				{
					System.setProperty("webdriver.gecko.driver",webDriverExe);
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				}
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:browserLanch,Input_Data:" + inputParameters[1].toString());
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:browserLanch,Input_Data:" + inputParameters[1].toString());
		}
		return outputparameters;
		}
	//OpenApplication
	public static Hashtable <String,Object> openApplication(Object[]inputParameters)
	{
		try 
		{
		String strURL=(String) inputParameters[0];
		driver.get(strURL);
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:openApplication,Input_Data:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:openApplication,Input_Data:" + inputParameters[0].toString());
		}
		return outputparameters;
	}
	//ClickOnElement
	public static Hashtable <String,Object> clickOnElement(Object[]inputParameters)
	{
		try 
		{
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:clickOnElement,Input_Data:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:clickOnElement,Input_Data:" + inputParameters[0].toString());
		}
		return outputparameters;
	}
	//moveToElement
	public static Hashtable <String,Object> moveToElement(Object[]inputParameters)
	{
		try 
		{
		String xpath=(String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement element= driver.findElement(By.xpath(xpath));
		act.moveToElement(element).build().perform();
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:moveToElement,Input_Data:" + inputParameters[0].toString());
		
		
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:moveToElement,Input_Data:" + inputParameters[0].toString());
		}
		return outputparameters;
	}
	//sendkeys 
	public static Hashtable <String,Object> senkeys(Object[]inputParameters)
	{
		try 
		{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];
		String strValue=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(strValue);
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:senkeys,Input_Data:" + inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:senkeys,Input_Data:" + inputParameters[1].toString());
		}
		return outputparameters;
	}
	public static Hashtable <String,Object> validationLogin(Object[]inputParameters)
	{
		try 
		{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String givenText=(String) inputParameters[0];
		String xpath=(String) inputParameters[1];
		String text=driver.findElement(By.xpath(xpath)).getText();
		if(givenText.equalsIgnoreCase(text))
		{
			System.out.println("Test case PASS");
		}
		else
		{
			System.out.println("Test case FAIL");
		}
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:validationLogin,Input_Data:" + inputParameters[0].toString());
		}
		catch(Exception e)
		
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:validationLogin,Input_Data:" + inputParameters[0].toString());
		}
		return outputparameters;
	}
	
}
