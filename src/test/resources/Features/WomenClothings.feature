Feature: Validation Women page contains clothing products

		Background:
					Given User is on login page
					When 	user eneters username "beohar.shorya@gmail.com"
					When 	user enters password "Selenium123"
					And  	Clicks on Login button
					Then 	Verify page title as "My account - My Shop"



Scenario: Verify products in Women clothing page
					Given  Logged in with valid credentials with username "Nicolos puran"
					 When 	click on women Top Menu
					 Then 	Women page should get displayed with logo "WOMEN"
					 Then   Verify total women clothings products is 7
					 Then 	Verify the price and name displayed for each products
				        