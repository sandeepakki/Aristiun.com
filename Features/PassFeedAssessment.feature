Feature: Creating Passing FeedbackType Assessment
@smoke
Scenario: Creating New Template
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	And click on Add New button
	Then Edit Template Info
	And click on Add button
	Then click on save
	Then user can view success message "Template saved successfully"
	And close browser

@smoke2
Scenario: Adding Section 1-10Slider
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section
	And user enters section Name
	And user clicks on manage Description
	Then user enter input to Manage Description
	Then user clicks on manage Feedbacks
	And user enter input to feedbacks
	Then user clicks on Add Question
	Then user enters question
	And user selects answer type1_10slider
	And user selects standards
	Then clicks on save 
	And close browser
	
@smoke3	
Scenario: Adding Section 1-5Slider
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec2
	And user enters section Name sec2
	And user clicks on manage Description sec2
	Then user enter input to Manage Description sec2
	Then user clicks on manage Feedbacks sec2
	And user enter input to feedbacks sec2
	Then user clicks on Add Question sec2
	Then user enters question sec2
	And user selects answer type sec2
	And user selects standards sec2
	Then click on save sec2 
	Then user can view success message "Template saved successfully"
	And close browser	
	
@smoke4
Scenario: Adding Section Single-Selection
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec3
	And user enters section Name sec3
	And user clicks on manage Description sec3
	Then user enter input to Manage Description sec3
	Then user clicks on manage Feedbacks sec3
	And user enter input to feedbacks sec3
	Then user clicks on Add Question sec3
	Then user enters question sec3
	And user selects answer type sec3
	Then user clicks Add Answer, enters choice, enters score
	Then user clicks Add Answer2,enters choice2,enters score2
	Then click on save sec3
	Then user can view success message "Template saved successfully"
	And close browser	
	
@smoke5
Scenario: Adding Section Multiple-Selection
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec4
	And user enters section Name sec4
	And user clicks on manage Description sec4
	Then user enter input to Manage Description sec4
	Then user clicks on manage Feedbacks sec4
	And user enter input to feedbacks sec4
	Then user clicks on Add Question sec4
	Then user enters question sec4
	And user selects answer type sec4
	Then user clicks AddAnswer,entersChoice,entersScore
	Then user clicks AddAnswer2,entersChoice2,entersScore2
	Then user clicks AddAnswer3,entersChoice3,entersScore3
	Then click on save sec4
	Then user can view success message "Template saved successfully"
	And close browser

@smoke6
Scenario: Adding Section Yes/No Type Question
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec5
	And user enters section Name sec5
	And user clicks on manage Description sec5
	Then user enter input to Manage Description sec5
	Then user clicks on manage Feedbacks sec5
	And user enter input to feedbacks sec5
	Then user clicks on Add Question sec5
	Then user enters question sec5
	And user selects answer type sec5
	Then click on save sec5
	Then user can view success message "Template saved successfully"
	And close browser	
	
@smoke7
Scenario: Adding Section FreeText Type Question
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec6
	And user enters section Name sec6
	And user clicks on manage Description sec6
	Then user enter input to Manage Description sec6
	Then user clicks on manage Feedbacks sec6
	And user enter input to feedbacks sec6
	Then user clicks on Add Question sec6
	Then user enters question sec6
	And user selects answer type sec6
	Then click on save sec6
	Then user can view success message "Template saved successfully"
	And close browser
	
@smoke8
Scenario: Adding Section FileUpload Type Question
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec7
	And user enters section Name sec7
	And user clicks on manage Description sec7
	Then user enter input to Manage Description sec7
	Then user clicks on manage Feedbacks sec7
	And user enter input to feedbacks sec7
	Then user clicks on Add Question sec7
	Then user enters question sec7
	And user selects answer type sec7
	Then click on save sec7
	Then user can view success message "Template saved successfully"
	And close browser	

@smoke9
Scenario: Adding Section8 Geographic Type Question
	Given user launch chrome browser
	When user opens url "https://knowit.aristiun.com/login"
	And user enters email "saket@travelder.com" and password "dev_aristiun"
	And click on LOGIN
	When user click on Assessment Tab
	And click on Templates under publish
	When  user clicks on template
	Then user clicks on ADD New Section sec8
	And user enters section Name sec8
	And user clicks on manage Description sec8
	Then user enter input to Manage Description sec8
	Then user clicks on manage Feedbacks sec8
	And user enter input to feedbacks sec8
	Then user clicks on Add Question sec8
	Then user enters question sec8
	And user selects answer type sec8
	Then click on save sec8
	Then user can view success message "Template saved successfully"
	And close browser	

	
		