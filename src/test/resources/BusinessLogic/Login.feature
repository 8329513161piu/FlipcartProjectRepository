Feature: Login Functionality

Background: user is on Filpcart main page and mouse over on login Button
Given user open "Chrome" browser with exe "E:\\\\Testing Support\\\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancle initial window
Given user move on Login Button

@SmokeTest
Scenario: Login Functionality with valid credentials
When user click on my profile
When user enter "8329513161" as username
When user enter "abc@123" as password
When user click on Login Button
Then Application Shows profile to user
