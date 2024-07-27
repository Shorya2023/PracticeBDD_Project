Feature: login Page features

@SmokeTests
Scenario: Login Page title
Given User is on login page 
Then  Page title should be "Login - My Shop"

Scenario: Login with valid credentials 
Given User is on login page
When user eneters username "beohar.shorya@gmail.com"
When user enters password "Selenium123"
And  Clicks on Login button
Then Verify page title as "My account - My Shop"

