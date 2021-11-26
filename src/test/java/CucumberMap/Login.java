package CucumberMap;

import java.util.Hashtable;

import Utility.HTMLReportGenerator;
import Utility.SeleniumOperation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
{

	@Given("^user open \"(.*)\" browser with exe \"(.*)\"$")
	public void browserLaunch(String bname,String exe)
	{
		Object[] input1=new Object[2];
		input1[0]=bname;
		input1[1]=exe;
		SeleniumOperation.browserLanch(input1);
		}
	@Given("^user enter url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input2=new Object[1];
		input2[0]=url;
		SeleniumOperation.openApplication(input2);
		
	}
	@Given("^user cancle initial window$")
	public void clickonCancle()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation.clickOnElement(input3);
		
	}

	@Given("^user move on Login Button$")
	public void moveToElement()
	{
		Object[] input4=new Object[1];
		input4[0]="//*[text()='Login']";
		SeleniumOperation.moveToElement(input4);
		
	}
	@When("^user click on my profile$")
	public void clickonMyprofile()
	{
		Object[] input5=new Object[1];
		input5[0]="//*[text()='My Profile']";
		Hashtable<String,Object> output5=SeleniumOperation.clickOnElement(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on my profile$",output5.get("MESSAGE").toString());
	}
	@When("^user enter \"(.*)\" as username$")
	public void username(String uname)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]=uname;
		Hashtable<String,Object> output6=SeleniumOperation.senkeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"(.*)\" as username$",output6.get("MESSAGE").toString());
	}
	@When("^user enter \"(.*)\" as password$")
	public void password(String passwd)
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@type='password']";
		input7[1]=passwd;
		Hashtable<String,Object> output7=SeleniumOperation.senkeys(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter \"(.*)\" as password$",output7.get("MESSAGE").toString());
		}
	@When("^user click on Login Button$")
	public void click()
	{
		Object[] input8=new Object[1];
		input8[0]="(//*[text()='Login']) [3]";
		Hashtable<String,Object> output8=SeleniumOperation.clickOnElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login Button$",output8.get("MESSAGE").toString());
		}
	@Then("^Application Shows profile to user$")
	public void Login()
	{
		Object[] input9=new Object[2];
		input9[0]="Priyanka Pawar";
		input9[1]="//*[text()='Priyanka Pawar']";
		Hashtable<String,Object> output9=SeleniumOperation.validationLogin(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^Application Shows profile to user$",output9.get("MESSAGE").toString());
	}


}
