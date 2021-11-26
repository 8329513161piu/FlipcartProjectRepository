package CucumberMap;

import java.net.UnknownHostException;

import Utility.HTMLReportGenerator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{
	@Before
	public void beforeMethod(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\MorningBatch\\Flipcart.html", "FilpcartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(),scenario.getStatus().toString());
		
		System.out.println("..............Scenario start.................");
	}
	@After
    public void afterMethod(Scenario scenario)
    {
    	System.out.println("..............Scenario End.................");
    	
    	HTMLReportGenerator.TestCaseEnd();
    	HTMLReportGenerator.TestSuiteEnd();
    }
}
