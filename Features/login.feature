Feature: login to aristiun

Scenario: Successfull Login with valid credential as admin user
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	Then page title should be "Assessment"
	Then  click on user icon
	When user click on Sign Out link
	Then page title should be "Assessment"
	And close browser
	
	Scenario Outline: Login Data Driven
	Given user launch chrome browser
	When user opens url "https://dev-sa.aristiun.com/login"
	And user enters email "<email>" and password "<password>"
	And click on LOGIN
	Then page title should be "Assessment"
	Then  click on user icon
	When user click on Sign Out link
	Then page title should be "Assessment"
	And close browser
	
	Examples:
				|email |   password   |
			| sandeep.akki@assystant.com | San@3004 |
			| sandeep.akki@assystant.com| San@3000 |