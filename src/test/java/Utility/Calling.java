package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Calling 
{

	public static void main(String[] args) 
	{
		//launchBrowser
		Object[] input1=new Object[2];
		input1[0]="chrome";
		input1[1]="E:\\\\Testing Support\\\\chromedriver.exe";
		SeleniumOperation.browserLanch(input1);
		
		//open application
		Object[] input2=new Object[1];
		input2[0]="https://www.flipkart.com/";
		SeleniumOperation.openApplication(input2);
		
		//click on cancle
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation.clickOnElement(input3);
		
		//moveToElement
		
		Object[] input4=new Object[1];
		input4[0]="//*[text()='Login']";
		SeleniumOperation.moveToElement(input4);
		
		//click on my Profile
		Object[] input5=new Object[1];
		input5[0]="//*[text()='My Profile']";
		SeleniumOperation.clickOnElement(input5);
		
		//enter username

		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]="8329513161";
		SeleniumOperation.senkeys(input6);
		
		// enter password
		
		Object[] input7=new Object[2];
		input7[0]="//*[@type='password']";
		input7[1]="abc@123";
		SeleniumOperation.senkeys(input7);
		
		//click on login
		Object[] input8=new Object[1];
		input8[0]="(//*[text()='Login']) [3]";
		SeleniumOperation.clickOnElement(input8);
		
		//click on manage address
		
		Object[] input9=new Object[1];
		input9[0]="//*[@class='NS64GK'][1]";
		SeleniumOperation.clickOnElement(input9);
		
		// click on add address
		
		Object[] input10=new Object[1];
		input10[0]="//*[@class='_1QhEVk']";
		SeleniumOperation.clickOnElement(input10);
		
		// enter name
		Object[] input11=new Object[2];
		input11[0]="//*[@class='_1w3ZZo _2mFmU7'][1]";
		input11[1]="Priyanka";
		SeleniumOperation.senkeys(input11);
		
		// enter mobile no
		Object[] input12=new Object[2];
		input12[0]="//*[@name='phone']";
		input12[1]="9970383621";
		SeleniumOperation.senkeys(input12);
		
		//enter pincode
		Object[] input13=new Object[2];
		input13[0]="//*[@autocomplete='postal-code']";
		input13[1]="411001";
		SeleniumOperation.senkeys(input13);
		
		
		//enter Locality
		Object[] input14=new Object[2];
		input14[0]="//*[@name='addressLine2']";
		input14[1]="Rahuri";
		SeleniumOperation.senkeys(input14);
		
		//enter address
		Object[] input15=new Object[2];
		input15[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input15[1]="Ahmednagar";
		SeleniumOperation.senkeys(input15);
		
		//click on radio button
		Object[] input16=new Object[1];
		input16[0]="//*[@class='_1XFPmK'][1]";
		SeleniumOperation.clickOnElement(input16);
		
		// click on save
		
		Object[] input17=new Object[1];
		input17[0]="//*[@tabindex='10']";
		SeleniumOperation.clickOnElement(input17);	
					
	}

}

