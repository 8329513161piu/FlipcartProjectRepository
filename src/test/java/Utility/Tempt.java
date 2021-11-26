package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// open Flipkart Application 
		driver.get("https://www.flipkart.com/");
		//  close login
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Thread.sleep(3000);
		//navigate to login
		Actions act=new Actions(driver);
		WebElement login= driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(login).build().perform();
		Thread.sleep(3000);
		// click on My Profile
		driver.findElementByXPath("//*[text()='My Profile']").click();
		Thread.sleep(6000);
		//enter username
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("8329513161");
		Thread.sleep(3000);
		//enter password
		driver.findElementByXPath("//*[@type='password']").sendKeys("abc@123");
		Thread.sleep(3000);
		//click on Login
		driver.findElementByXPath("(//*[text()='Login']) [3]").click();
		Thread.sleep(5000);
		// Click on my manage address
		driver.findElementByXPath("//*[@class='NS64GK'][1]").click();
		Thread.sleep(6000);
		//click on add address
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
		Thread.sleep(6000);
		// name
		driver.findElementByXPath("//*[@class='_1w3ZZo _2mFmU7'][1]").sendKeys("Girija");
		//Phon no
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8329513161");
		Thread.sleep(2000);
		//pincode
		driver.findElementByXPath("//*[@autocomplete='postal-code']").sendKeys("411001");
		//Locality
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Delhigate");
		//address
		driver.findElementByXPath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']").sendKeys("Ahmednagar");
		//rediobutton
		driver.findElementByXPath("//*[@class='_1XFPmK'][1]").click();
		//save
		
		driver.findElementByXPath("//*[@tabindex='10']").click();
		
		
		
		
		
	}
		
		
		
		
	}

	

