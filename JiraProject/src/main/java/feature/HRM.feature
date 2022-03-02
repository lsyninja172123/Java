Feature: HRM login functionality
@login
Scenario: To verify HRM login functionality
Given user is on login page
When user enters username and password
And user clicks login button
Then user navigated to admin page and loggedout 

@screenshot
Scenario: Taking Login Page Screenshot 
 Given user is on the login page
When user enters the username and password
Then user taking the screenshot