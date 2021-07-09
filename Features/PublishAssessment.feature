Feature: Publish Passing FeedbackType Assessment
@smoke
Scenario: Creating New Template
	Given user launch chrome browser
	When user opens url "https://sa.aristiun.com/login"
	Then user enters email "saket@travelder.com" and password "dev_aristiun"
	Then click on LOGIN
	When user click on Assessment Tab
	Then click on Templates under publish
	When  user clicks on template 
	Then click on dropdown button to click publish Assessment
	Then select resource from dropdown
	Then select reviewer from dropdown
	Then tick allow editing checkbox
	Then tick allow partial save
	Then click on Next
	Then click on allow categories
	Then Enter Category Name for Category1
	Then click on Manage feedbacks for C1 enter overall pass/fail feed
	Then Enter Category Name for Category2
	Then click on Manage feedbacks for C2 enter overall pass/fail feed
	Then Enter Category Name for Category3
	Then click on Manage feedbacks for C3 enter overall pass/fail feed
	Then Enter Category Name for Category4
	Then click on Manage feedbacks for C4 enter overall pass/fail feed
	Then Click on all the checkboxes that need to show in report
	Then user click on Next
	Then click on executive report checkbox
	Then select any report template
	Then select graph to display in executive report from dropdown
	Then Click on Publish
	Then user can view success message "Assessment Published Successfully"
	And close browser
	