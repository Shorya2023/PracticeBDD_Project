Feature: Validation of User informations on home page

		Background:
					Given User is on login page
					When 	user eneters username "beohar.shorya@gmail.com"
					When 	user enters password "Selenium123"
					And  	Clicks on Login button
					Then 	Verify page title as "My account - My Shop"


@smoke
Scenario: Verify all the manage orders Tabs exists
					Given  Logged in with valid credentials with username "Nicolos puran"
					Then veriy total orders tab will be 5
					Then   Verify different Orders history tabs
				         |ADD MY FIRST ADDRESS|
									|ORDER HISTORY AND DETAILS|
									|MY CREDIT SLIPS|
									|MY ADDRESSES|
									|MY PERSONAL INFORMATION|