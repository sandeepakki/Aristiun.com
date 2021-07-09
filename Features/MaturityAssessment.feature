Feature: Creating Maturity FeedbackType Assessment

@smoke
Scenario: Creating New Template
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tabs
	And click on Templates under publish toggle
	And click on Add New buttonMaturity
	Then Edit Template Information
	And click on Add buttons
	Then click on save button
	Then user can view successful message "Template saved successfully"
	And close browser
	
@smoke2
Scenario: Adding Section 1-10Slider
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tabs
	And click on Templates under publish toggle
	When  user clicks on template section1
	Then user clicks on ADD New Section maturity
	And user enters section Name maturity
	And user clicks on manage Descriptions maturity
	Then user enter input to Manage Descriptions maturity
	Then user clicks on manage Feedbacks maturity
	And user enter input to feedbacks maturity
	Then user clicks on Add Question section1
	Then user enters question section1
	And user selects answer type1_10slider section1
	And user selects standards section1
	Then clicks on save section1
	Then user can view successful message "Template saved successfully"
	And close browser	
	
@smoke3	
Scenario: Adding Section 1-5Slider
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tabs
	And click on Templates under publish toggle
	When  user clicks on template section2
	Then user clicks on ADD New Section mat sec2
	And user enters section Name mat sec2
	And user clicks on manage Description mat sec2
	Then user enter input to Manage Description mat sec2
	Then user clicks on manage Feedbacks mat sec2
	And user enter input to feedbacks mat sec2
	Then user clicks on Add Question mat sec2
	Then user enters question mat sec2
	And user selects answer type1_5Slider mat sec2
	Then click on save mat sec2 
	Then user can view successful message "Template saved successfully"
	And close browser	
	
@smoke4
Scenario: Adding Section Single-Selection
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tabs
	And click on Templates under publish toggle
	When  user clicks on template section3
	Then user clicks on ADD New Section mat sec3
	And user enters section Name mat sec3
	And user clicks on manage Description mat sec3
	Then user enter input to Manage Description mat sec3
	Then user clicks on manage Feedbacks mat sec3
	And user enter input to feedbacks mat sec3
	Then user clicks on Add Question mat sec3
	Then user enters question mat sec3
	And user selects answer type mat sec3
	Then user clicks Add Answer, enters choice, enters score mat
	Then user clicks Add Answer2,enters choice2,enters score2 mat
	Then click on save mat sec3
	Then user can view successful message "Template saved successfully"
	And close browser

@smoke5
Scenario: Adding Section Multiple-Selection
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tabs
	And click on Templates under publish toggle
	When  user clicks on template section4
	Then user clicks on ADD New Section mat sec4
	And user enters section Name mat sec4
	And user clicks on manage Description mat sec4
	Then user enter input to Manage Description mat sec4
	Then user clicks on manage Feedbacks mat sec4
	And user enter input to feedbacks mat sec4
	Then user clicks on Add Question mat sec4
	Then user enters question mat sec4
	And user selects answer type mat sec4
	Then user clicks Add Answer, enters choice, enters score mat
	Then user clicks Add Answer2,enters choice2,enters score2 mat
	Then click on save mat sec4
	Then user can view successful message "Template saved successfully"
	And close browser	

@smoke6
Scenario: Adding Section Yes/No Type Question
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tabs
	And click on Templates under publish toggle
	When  user clicks on template section5
	Then user clicks on ADD New Section mat sec5
	And user enters section Name mat sec5
	And user clicks on manage Description mat sec5
	Then user enter input to Manage Description mat sec5
	Then user clicks on manage Feedbacks mat sec5
	And user enter input to feedbacks mat sec5
	Then user clicks on Add Question mat sec5
	Then user enters question sec5
	And user selects answer type sec5
	Then click on save sec5
	Then user can view success message "Template saved successfully"
	And close browser	
	
	
