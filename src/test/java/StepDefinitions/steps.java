package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.AddSection1_10Slider;
import PageObjects.AddSection1_5slider;
import PageObjects.PassingTemplate;
import PageObjects.FreeText;
import PageObjects.LoginPage;
import PageObjects.MultipleSelection;
import PageObjects.Section8;
import PageObjects.SingleSelection;
import PageObjects.UploadFile;
import PageObjects.Yes_No_Type;
import PageObjects.publishPassTemp;
import PageObjectsMaturity.Maturity1_10Slider;
import PageObjectsMaturity.Maturity1_5Slider;
import PageObjectsMaturity.MaturityTemplate;
import PageObjectsMaturity.Maturity_Yes_No;
import PageObjectsMaturity.MultipleSelectionMaturity;
import PageObjectsMaturity.SingleSelectionMaturity;
import io.cucumber.java.en.*;


public class steps extends BaseClass {

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		lp=new LoginPage(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) throws InterruptedException {
		Thread.sleep(3000);
		lp.setUsername(email);
		lp.setPassword(password);
	}

	@When("click on LOGIN")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {

		Assert.assertEquals(title,driver.getTitle());

	}

	@Then("click on user icon")
	public void click_on_user_icon() throws InterruptedException {
		lp.clickUsericon();
		Thread.sleep(1000);
	}

	@When("user click on Sign Out link")
	public void user_click_on_sign_out_link() {
		lp.clickSignout();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

	// Passing feedback type Template

	@When("user click on Assessment Tab")
	public void user_click_on_assessment_tab() {
		AT = new PassingTemplate(driver);
		AT.clickonAssessment();
	}
	@When("click on Templates under publish")
	public void click_on_templates_under_publish() {
		AT.clickonTemplate();
	}
	@When("click on Add New button")
	public void click_on_add_new_button() {
		AT.clickonAddNewButton();
	}
	@Then("Edit Template Info")
	public void Edit_Template_Info() {
		AT.settempName();
		AT.enterTempIntro();
		AT.enterExeIntro();
		AT.enterPassSumm();
		AT.enterFailSumm();
		AT.enterPassNxtSteps();
		AT.enterFailNxtSteps();
		AT.enterAbtTemp();
	}
	@Then("click on Add button")
	public void click_on_add_button() {
		AT.clickonAddBtn();
	}
	@Then("click on save")
	public void click_on_save() throws InterruptedException {
		AT.clickonSavebtn();
		Thread.sleep(1000);
	}
	@Then("user can view success message {string}")
	public void user_can_view_success_message(String msg) throws InterruptedException {
		AT.successmsg();
	}

	//Adding Section1_10slider

	@When("user clicks on template")
	public void user_clicks_on_template() {
		AS = new AddSection1_10Slider(driver);
		AS.clickonTemplate();

	}
	@Then("user clicks on ADD New Section")
	public void user_clicks_on_add_new_section() {
		AS.clickAddSection();
	}
	@Then("user enters section Name")
	public void user_enters_section_name() {
		AS.enterSectionName();
	}
	@Then("user clicks on manage Description")
	public void user_clicks_on_manage_description() {
		AS.clickSectionDesc();
	}
	@Then("user enter input to Manage Description")
	public void user_enter_input_to_manage_description() {
		AS.enterSectionDesc();  
	}
	@Then("user clicks on manage Feedbacks")
	public void user_clicks_on_manage_feedbacks() {
		AS.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks")
	public void user_enter_input_to_feedbacks() {
		AS.enterSecPassFeed();
		AS.entersectFailFeed();
		AS.entersectPassSumm();
		AS.entersectFailSumm();
		AS.entersectPassNxtStep();
		AS.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question")
	public void user_clicks_on_add_question() {
		AS.clickAddQns();
	}
	@Then("user enters question")
	public void user_enters_question() {
		AS.enterQns();
	}
	@Then("user selects answer type1_10slider")
	public void user_selects_answer_type1_10slider() {
		AS.clickAnswerType();
		AS.selectAnswerType();
	}
	@Then("user selects standards")
	public void user_selects_standards() {
		AS.clickStandard();
		AS.selectStandard();
	}
	@Then("clicks on save")
	public void clicks_on_save() throws InterruptedException {
		AS.clickSave();
		Thread.sleep(1000);
	}

	//Adding Section1_5Slider

	@Then("user clicks on ADD New Section sec2")
	public void user_clicks_on_add_new_section_sec2() {
		AS1 = new AddSection1_5slider(driver);
		AS1.clickAddSection();
	}
	@Then("user enters section Name sec2")
	public void user_enters_section_name_sec2() {
		AS1.enterSectionName();
	}
	@Then("user clicks on manage Description sec2")
	public void user_clicks_on_manage_description_sec2() {
		AS1.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec2")
	public void user_enter_input_to_manage_description_sec2() {
		AS1.enterSectionDesc();  
	}
	@Then("user clicks on manage Feedbacks sec2")
	public void user_clicks_on_manage_feedbacks_sec2() {
		AS1.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec2")
	public void user_enter_input_to_feedbacks_sec2() {
		AS1.enterSecPassFeed();
		AS1.entersectFailFeed();
		AS1.entersectPassSumm();
		AS1.entersectFailSumm();
		AS1.entersectPassNxtStep();
		AS1.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec2")
	public void user_clicks_on_add_question_sec2() {
		AS1.clickAddQns();
	}
	@Then("user enters question sec2")
	public void user_enters_question_sec2() {
		AS1.enterQns();
	}
	@Then("user selects answer type sec2")
	public void user_selects_answer_type_sec2() {
		AS1.clickAnswerType();
		AS1.selectAnswerType();
	}
	@Then("user selects standards sec2")
	public void user_selects_standards_sec2() throws InterruptedException {
		AS1.clickStandard();
		AS1.selectStandard();
	}
	@Then("click on save sec2")
	public void click_on_save_sec2() throws InterruptedException {
		AS1.clickSave();
	}

	//Adding Section Single Selection

	@Then("user clicks on ADD New Section sec3")
	public void user_clicks_on_add_new_section_sec3() {
		AS2 = new SingleSelection(driver);
		AS2.clickAddSection();
	}
	@Then("user enters section Name sec3")
	public void user_enters_section_name_sec3() {
		AS2.enterSectionName();
	}
	@Then("user clicks on manage Description sec3")
	public void user_clicks_on_manage_description_sec3() {
		AS2.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec3")
	public void user_enter_input_to_manage_description_sec3() {
		AS2.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks sec3")
	public void user_clicks_on_manage_feedbacks_sec3() {
		AS2.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec3")
	public void user_enter_input_to_feedbacks_sec3() {
		AS2.enterSecPassFeed();
		AS2.entersectFailFeed();
		AS2.entersectPassSumm();
		AS2.entersectFailSumm();
		AS2.entersectPassNxtStep();
		AS2.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec3")
	public void user_clicks_on_add_question_sec3() {
		AS2.clickAddQns();
	}
	@Then("user enters question sec3")
	public void user_enters_question_sec3() {
		AS2.enterQns();
	}
	@Then("user selects answer type sec3")
	public void user_selects_answer_type_sec3() {
		AS2.clickAnswerType();
		AS2.selectAnswerType();
	}
	@Then("user clicks Add Answer, enters choice, enters score")
	public void user_clicks_add_answer_enters_choice_enters_score() {
		AS2.clickAddAnswer();
		AS2.enterChoiceLabel();
		AS2.enterScore();
	}
	@Then("user clicks Add Answer2,enters choice2,enters score2")
	public void user_clicks_add_answer2_enters_choice2_enters_score2() {
		AS2.clickAddAnswer1();
		AS2.enterChoiceLabel1();
		AS2.enterScore1();
	}
	@Then("click on save sec3")
	public void click_on_save_sec3() throws InterruptedException {
		AS2.clickSave();  
	}

	//Adding Section Multiple Selection

	@Then("user clicks on ADD New Section sec4")
	public void user_clicks_on_add_new_section_sec4() {
		AS3 = new MultipleSelection(driver);
		AS3.clickAddSection();
	}
	@Then("user enters section Name sec4")
	public void user_enters_section_name_sec4() {
		AS3.enterSectionName();
	}
	@Then("user clicks on manage Description sec4")
	public void user_clicks_on_manage_description_sec4() {
		AS3.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec4")
	public void user_enter_input_to_manage_description_sec4() {
		AS3.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks sec4")
	public void user_clicks_on_manage_feedbacks_sec4() {
		AS3.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec4")
	public void user_enter_input_to_feedbacks_sec4() {
		AS3.enterSecPassFeed();
		AS3.entersectFailFeed();
		AS3.entersectPassSumm();
		AS3.entersectFailSumm();
		AS3.entersectPassNxtStep();
		AS3.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec4")
	public void user_clicks_on_add_question_sec4() {
		AS3.clickAddQns();
	}
	@Then("user enters question sec4")
	public void user_enters_question_sec4() {
		AS3.enterQns();
	}
	@Then("user selects answer type sec4")
	public void user_selects_answer_type_sec4() {
		AS3.clickAnswerType();
		AS3.selectAnswerType();
	}

	@Then("user clicks AddAnswer,entersChoice,entersScore")
	public void user_clicks_AddAnswer_entersChoice_entersScore() {
		AS3.clickAddAnswer();
		AS3.enterChoiceLabel();
		AS3.enterScore();
	}
	@Then("user clicks AddAnswer2,entersChoice2,entersScore2")
	public void user_clicks_addAnswer2_entersChoice2_entersScore2() {
		AS3.clickAddAnswer1();
		AS3.enterChoiceLabel1();
		AS3.enterScore1();
	}
	@Then("user clicks AddAnswer3,entersChoice3,entersScore3")
	public void user_clicks_AddAnswer3_entersChoice3_entersScore3() {
		AS3.clickAddAnswer2();
		AS3.enterChoiceLabel2();
		AS3.enterScore2();
	}

	@Then("click on save sec4")
	public void click_on_save_sec4() throws InterruptedException {
		AS3.clickSave();
	}
	
// Adding Section 5 Yes or No answer type
	
	@Then("user clicks on ADD New Section sec5")
	public void user_clicks_on_add_new_section_sec5() {
	   AS4 = new Yes_No_Type(driver);
	   AS4.clickAddSection();
	   
	}
	@Then("user enters section Name sec5")
	public void user_enters_section_name_sec5() {
	   AS4.enterSectionName();
	}
	@Then("user clicks on manage Description sec5")
	public void user_clicks_on_manage_description_sec5() {
	    AS4.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec5")
	public void user_enter_input_to_manage_description_sec5() {
	    AS4.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks sec5")
	public void user_clicks_on_manage_feedbacks_sec5() {
	   AS4.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec5")
	public void user_enter_input_to_feedbacks_sec5() {
	   AS4.enterSecPassFeed();
	   AS4.entersectFailFeed();
	   AS4.entersectPassSumm();
	   AS4.entersectFailSumm();
	   AS4.entersectPassNxtStep();
	   AS4.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec5")
	public void user_clicks_on_add_question_sec5() {
	    AS4.clickAddQns();
	}
	@Then("user enters question sec5")
	public void user_enters_question_sec5() {
	  AS4.enterQns();
	}
	@Then("user selects answer type sec5")
	public void user_selects_answer_type_sec5() {
	AS4.clickAnswerType();
	AS4.selectAnswerType();
	}
	@Then("click on save sec5")
	public void click_on_save_sec5() throws InterruptedException {
	   AS4.clickSave();
	}
	
//Adding Section Free text type
	@Then("user clicks on ADD New Section sec6")
	public void user_clicks_on_add_new_section_sec6() {
	   AS5 = new FreeText(driver);
	   AS5.clickAddSection();
	   
	}
	@Then("user enters section Name sec6")
	public void user_enters_section_name_sec6() {
	   AS5.enterSectionName();
	}
	@Then("user clicks on manage Description sec6")
	public void user_clicks_on_manage_description_sec6() {
	    AS5.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec6")
	public void user_enter_input_to_manage_description_sec6() {
	    AS5.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks sec6")
	public void user_clicks_on_manage_feedbacks_sec6() {
	   AS5.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec6")
	public void user_enter_input_to_feedbacks_sec6() {
	   AS5.enterSecPassFeed();
	   AS5.entersectFailFeed();
	   AS5.entersectPassSumm();
	   AS5.entersectFailSumm();
	   AS5.entersectPassNxtStep();
	   AS5.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec6")
	public void user_clicks_on_add_question_sec6() {
	    AS5.clickAddQns();
	}
	@Then("user enters question sec6")
	public void user_enters_question_sec6() {
	  AS5.enterQns();
	}
	@Then("user selects answer type sec6")
	public void user_selects_answer_type_sec6() {
	AS5.clickAnswerType();
	AS5.selectAnswerType();
	}
	@Then("click on save sec6")
	public void click_on_save_sec6() throws InterruptedException {
	   AS5.clickSave();
	}
	
//Adding Section Upload file type
	
	@Then("user clicks on ADD New Section sec7")
	public void user_clicks_on_add_new_section_sec7() {
	   AS6 = new UploadFile(driver);
	   AS6.clickAddSection();
	   
	}
	@Then("user enters section Name sec7")
	public void user_enters_section_name_sec7() {
	   AS6.enterSectionName();
	}
	@Then("user clicks on manage Description sec7")
	public void user_clicks_on_manage_description_sec7() {
	    AS6.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec7")
	public void user_enter_input_to_manage_description_sec7() {
	    AS6.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks sec7")
	public void user_clicks_on_manage_feedbacks_sec7() {
	   AS6.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec7")
	public void user_enter_input_to_feedbacks_sec7() {
	   AS6.enterSecPassFeed();
	   AS6.entersectFailFeed();
	   AS6.entersectPassSumm();
	   AS6.entersectFailSumm();
	   AS6.entersectPassNxtStep();
	   AS6.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec7")
	public void user_clicks_on_add_question_sec7() {
	    AS6.clickAddQns();
	}
	@Then("user enters question sec7")
	public void user_enters_question_sec7() {
	  AS6.enterQns();
	}
	@Then("user selects answer type sec7")
	public void user_selects_answer_type_sec7() {
	AS6.clickAnswerType();
	AS6.selectAnswerType();
	}
	@Then("click on save sec7")
	public void click_on_save_sec7() throws InterruptedException {
	   AS6.clickSave();
	}
	
// Adding Section 8 Yes/No Type
	
	@Then("user clicks on ADD New Section sec8")
	public void user_clicks_on_add_new_section_sec8() {
	   AS7 = new Section8(driver);
	   AS7.clickAddSection();
	   
	}
	@Then("user enters section Name sec8")
	public void user_enters_section_name_sec8() {
	   AS7.enterSectionName();
	}
	@Then("user clicks on manage Description sec8")
	public void user_clicks_on_manage_description_sec8() {
	    AS7.clickSectionDesc();
	}
	@Then("user enter input to Manage Description sec8")
	public void user_enter_input_to_manage_description_sec8() {
	    AS7.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks sec8")
	public void user_clicks_on_manage_feedbacks_sec8() {
	   AS7.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks sec8")
	public void user_enter_input_to_feedbacks_sec8() {
	   AS7.enterSecPassFeed();
	   AS7.entersectFailFeed();
	   AS7.entersectPassSumm();
	   AS7.entersectFailSumm();
	   AS7.entersectPassNxtStep();
	   AS7.entersectFailNxtStep();
	}
	@Then("user clicks on Add Question sec8")
	public void user_clicks_on_add_question_sec8() {
	    AS7.clickAddQns();
	}
	@Then("user enters question sec8")
	public void user_enters_question_sec8() {
	  AS7.enterQns();
	}
	@Then("user selects answer type sec8")
	public void user_selects_answer_type_sec8() {
	AS7.clickAnswerType();
	AS7.selectAnswerType();
	}
	@Then("click on save sec8")
	public void click_on_save_sec8() throws InterruptedException {
	   AS7.clickSave();
	}
	
//Publish Assessment
	
	@Then("click on dropdown button to click publish Assessment")
	public void click_on_dropdown_button_to_click_publish_assessment() {
	   PPT = new publishPassTemp(driver);
	   PPT.clickToggle();
	   PPT.clickpubAssess();
	}
	@Then("select resource from dropdown")
	public void select_resource_from_dropdown() {
	 PPT.clickonResource();
	 PPT.selectResource();
	}
	@Then("select reviewer from dropdown")
	public void select_reviewer_from_dropdown() {
		PPT.clickonReviewer();
		PPT.selectReviewer();
	}
	@Then("tick allow editing checkbox")
	public void tick_allow_editing_checkbox() {
	PPT.clickAllowEdit();
	}
	@Then("tick allow partial save")
	public void tick_allow_partial_save() {
	    PPT.clickPartialSave();
	}
	@Then("click on Next")
	public void click_on_next() {
	   PPT.clickNext();
	}
	@Then("click on allow categories")
	public void click_on_allow_categories() {
	   PPT.clickAllowCategories();
	}
	@Then("Enter Category Name for Category1")
	public void enter_category_name_for_category1() {
	 PPT.enterCategory1();  
	}
	@Then("click on Manage feedbacks for C1 enter overall pass\\/fail feed")
	public void click_on_manage_feedbacks_for_c1_enter_overall_pass_fail_feed() {
		PPT.clickManageFeedbacks1();
		PPT.enterpassfeed1();
		PPT.enterfailfeed1();
	}
	@Then("Enter Category Name for Category2")
	public void enter_category_name_for_category2() {
		PPT.enterCategory2(); 
	}
	@Then("click on Manage feedbacks for C2 enter overall pass\\/fail feed")
	public void click_on_manage_feedbacks_for_c2_enter_overall_pass_fail_feed() {
		PPT.clickManageFeedbacks2();
		PPT.enterpassfeed2();
		PPT.enterfailfeed2();
	}
	@Then("Enter Category Name for Category3")
	public void enter_category_name_for_category3() {
		PPT.enterCategory3(); 
	}
	@Then("click on Manage feedbacks for C3 enter overall pass\\/fail feed")
	public void click_on_manage_feedbacks_for_c3_enter_overall_pass_fail_feed() {
		PPT.clickManageFeedbacks3();
		PPT.enterpassfeed3();
		PPT.enterfailfeed3();
	}
	@Then("Enter Category Name for Category4")
	public void enter_category_name_for_category4() {
		PPT.enterCategory4(); 
	}
	@Then("click on Manage feedbacks for C4 enter overall pass\\/fail feed")
	public void click_on_manage_feedbacks_for_c4_enter_overall_pass_fail_feed() {
		PPT.clickManageFeedbacks4();
		PPT.enterpassfeed4();
		PPT.enterfailfeed4();
	}
	@Then("Click on all the checkboxes that need to show in report")
	public void click_on_all_the_checkboxes_that_need_to_show_in_report() {
	    PPT.clickShowQnsDesc();
	    PPT.clickshowSumm();
	    PPT.clickshowNxtSteps();
	    PPT.clickshowheatmap();
	    PPT.clickshowSuperSection();
	}
	@Then("user click on Next")
	public void user_click_on_next() {
	  PPT.clickNext2();
	}
	@Then("click on executive report checkbox")
	public void click_on_executive_report_checkbox() {
	  PPT.GeneratingExecutiveReport();
	}
	@Then("select any report template")
	public void select_any_report_template() {
	  PPT.select3Row();
	}
	@Then("select graph to display in executive report from dropdown")
	public void select_graph_to_display_in_executive_report_from_dropdown() {
	  PPT.clickGraph();
	  PPT.selectGraph();
	}
	@Then("Click on Publish")
	public void click_on_publish() {
		PPT.clickPublish();
	   
	}
	
// Maturity Feedback Type Assessment
	
	@When("user click on Assessment Tabs")
	public void user_click_on_assessment_tabs() {
		MT = new MaturityTemplate(driver);
		MT.clickonAssessment();
	}
	@And("click on Templates under publish toggle")
	public void click_on_templates_under_publish_toggle() {
		MT.clickonTemplate();
	}
	@And("click on Add New buttonMaturity")
	public void click_on_add_new_buttonMaturity() {
		MT.clickonAddNewButton();
	}
	@Then("Edit Template Information")
	public void Edit_Template_Information() {
		MT.settempName();
		MT.clickAssmType();
		MT.selectAssmType();
		MT.clickFdbType();
		MT.selectFdbType();
		MT.clickScorePatt();
		MT.selectScorePatt();
		MT.enterTempIntro();
		MT.enterExeIntro();
		MT.enterAvgSumm1();
		MT.enterAvgSumm2();
		MT.enterAvgSumm3();
		MT.enterAvgSumm4();
		MT.enterAvgSumm5();
		MT.enterNxtSteps1();
		MT.enterNxtSteps2();
		MT.enterNxtSteps3();
		MT.enterNxtSteps4();
		MT.enterNxtSteps5();
		MT.enterAbtTemp();
	}
	@And("click on Add buttons")
	public void click_on_add_buttons() {
		MT.clickonAddBtn();
	}
	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
		MT.clickonSavebtn();
		Thread.sleep(1000);
	}
	@Then("user can view successful message {string}")
	public void user_can_view_successful_message(String msg) throws InterruptedException {
		MT.successmsg();
	}
	
// Adding Maturity Assessment section 1
	
	@When("user clicks on template section1")
	public void user_clicks_on_template_section1() {
	   MS1 = new Maturity1_10Slider(driver);
	   MS1.clickonTemplate();
	}
	@Then("user clicks on ADD New Section maturity")
	public void user_clicks_on_add_new_section_maturity() {
	    MS1.clickAddSection();
	}
	@Then("user enters section Name maturity")
	public void user_enters_section_name_maturity() {
	    MS1.enterSectionName();
	}
	@Then("user clicks on manage Descriptions maturity")
	public void user_clicks_on_manage_descriptions_maturity() {
	   MS1.clickSectionDesc();
	}
	@Then("user enter input to Manage Descriptions maturity")
	public void user_enter_input_to_manage_descriptions_maturity() {
	    MS1.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks maturity")
	public void user_clicks_on_manage_feedbacks_maturity() {
	    MS1.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks maturity")
	public void user_enter_input_to_feedbacks_maturity() {
	    MS1.enterfeedbackML1();
	    MS1.enterfeedbackML2();
	    MS1.enterfeedbackML3();
	    MS1.enterfeedbackML4();
	    MS1.enterfeedbackML5();
	    MS1.entershortSummML1();
	    MS1.entershortSummML2();
	    MS1.entershortSummML3();
	    MS1.entershortSummML4();
	    MS1.entershortSummML5();
	    MS1.enterNxtSteps1();
	    MS1.enterNxtSteps2();
	    MS1.enterNxtSteps3();
	    MS1.enterNxtSteps4();
	    MS1.enterNxtSteps5();
	}
	@Then("user clicks on Add Question section1")
	public void user_clicks_on_add_question_section1() {
	   MS1.clickAddQns();
	}
	@Then("user enters question section1")
	public void user_enters_question_section1() {
	    MS1.enterQns();
	}
	@Then("user selects answer type1_10slider section1")
	public void user_selects_answer_type1_10slider_section1() {
		MS1.clickAnswerType();
		MS1.selectAnswerType();
	}
	@Then("user selects standards section1")
	public void user_selects_standards_section1() {
		MS1.clickStandard();
	    MS1.selectStandard();
	}
	@Then("clicks on save section1")
	public void clicks_on_save_section1() throws InterruptedException {
	  MS1.clickSave();
	}
	
// Adding Maturity Assessment Section 2
	
	@When("user clicks on template section2")
	public void user_clicks_on_template_section2() {
	   MS2 = new Maturity1_5Slider(driver);
	   MS2.clickonTemplate();
	}
	@Then("user clicks on ADD New Section mat sec2")
	public void user_clicks_on_add_new_section_mat_sec2() {
	    MS2.clickAddSection();
	}
	@Then("user enters section Name mat sec2")
	public void user_enters_section_name_mat_sec2() {
	    MS2.enterSectionName();
	}
	
	@Then("user clicks on manage Description mat sec2")
	public void user_clicks_on_manage_description_mat_sec2() {
	   MS2.clickSectionDesc();
	}
	@Then("user enter input to Manage Description mat sec2")
	public void user_enter_input_to_manage_description_mat_sec2() {
	    MS2.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks mat sec2")
	public void user_clicks_on_manage_feedbacks_mat_sec2() {
	    MS2.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks mat sec2")
	public void user_enter_input_to_feedbacks_mat_sec2() {
	    MS2.enterfeedbackML1();
	    MS2.enterfeedbackML2();
	    MS2.enterfeedbackML3();
	    MS2.enterfeedbackML4();
	    MS2.enterfeedbackML5();
	    MS2.entershortSummML1();
	    MS2.entershortSummML2();
	    MS2.entershortSummML3();
	    MS2.entershortSummML4();
	    MS2.entershortSummML5();
	    MS2.enterNxtSteps1();
	    MS2.enterNxtSteps2();
	    MS2.enterNxtSteps3();
	    MS2.enterNxtSteps4();
	    MS2.enterNxtSteps5();
	}
	@Then("user clicks on Add Question mat sec2")
	public void user_clicks_on_add_question_mat_sec2() {
	   MS2.clickAddQns();
	}
	@Then("user enters question mat sec2")
	public void user_enters_question_mat_sec2() {
	    MS2.enterQns();
	}
	@Then("user selects answer type1_5Slider mat sec2")
	public void user_selects_answer_type1_5Slider_mat_sec2() {
		MS2.clickAnswerType();
		MS2.selectAnswerType();
	}
	@Then("click on save mat sec2")
	public void clicks_on_save_mat_sec2() throws InterruptedException {
	  MS2.clickSave();
	}
// Adding Section 3 Single Selection
	
	@When("user clicks on template section3")
	public void user_clicks_on_template_section3() {
	   MS3 = new SingleSelectionMaturity(driver);
	   MS3.clickonTemplate();
	}
	@Then("user clicks on ADD New Section mat sec3")
	public void user_clicks_on_add_new_section_mat_sec3() {
	    MS3.clickAddSection();
	}
	@Then("user enters section Name mat sec3")
	public void user_enters_section_name_mat_sec3() {
	    MS3.enterSectionName();
	}
	
	@Then("user clicks on manage Description mat sec3")
	public void user_clicks_on_manage_description_mat_sec3() {
	   MS3.clickSectionDesc();
	}
	@Then("user enter input to Manage Description mat sec3")
	public void user_enter_input_to_manage_description_mat_sec3() {
	    MS3.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks mat sec3")
	public void user_clicks_on_manage_feedbacks_mat_sec3() {
	    MS3.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks mat sec3")
	public void user_enter_input_to_feedbacks_mat_sec3() {
	    MS3.enterfeedbackML1();
	    MS3.enterfeedbackML2();
	    MS3.enterfeedbackML3();
	    MS3.enterfeedbackML4();
	    MS3.enterfeedbackML5();
	    MS3.entershortSummML1();
	    MS3.entershortSummML2();
	    MS3.entershortSummML3();
	    MS3.entershortSummML4();
	    MS3.entershortSummML5();
	    MS3.enterNxtSteps1();
	    MS3.enterNxtSteps2();
	    MS3.enterNxtSteps3();
	    MS3.enterNxtSteps4();
	    MS3.enterNxtSteps5();
	}
	@Then("user clicks on Add Question mat sec3")
	public void user_clicks_on_add_question_mat_sec3() {
	   MS3.clickAddQns();
	}
	@Then("user enters question mat sec3")
	public void user_enters_question_mat_sec3() {
	    MS3.enterQns();
	}
	@Then("user selects answer type mat sec3")
	public void user_selects_answer_type_mat_sec3() {
		MS3.clickAnswerType();
		MS3.selectAnswerType();
	}
	@Then("user clicks Add Answer, enters choice, enters score mat")
	public void user_clicks_add_answer_enters_choice_enters_score_mat() {
		MS3.clickAddAnswer();
		MS3.enterChoiceLabel();
		MS3.enterScore();
	}
	@Then("user clicks Add Answer2,enters choice2,enters score2 mat")
	public void user_clicks_add_answer2_enters_choice2_enters_score2_mat() {
		MS3.clickAddAnswer1();
		MS3.enterChoiceLabel1();
		MS3.enterScore1();
	}
	@Then("click on save mat sec3")
	public void clicks_on_save_mat_sec3() throws InterruptedException {
	  MS3.clickSave();
	}

//Adding Multiple Selection Maturity Feedback
	
	@When("user clicks on template section4")
	public void user_clicks_on_template_section4() {
	   MS4 = new MultipleSelectionMaturity(driver);
	   MS4.clickonTemplate();
	}
	@Then("user clicks on ADD New Section mat sec4")
	public void user_clicks_on_add_new_section_mat_sec4() {
	    MS4.clickAddSection();
	}
	@Then("user enters section Name mat sec4")
	public void user_enters_section_name_mat_sec4() {
	    MS4.enterSectionName();
	}
	
	@Then("user clicks on manage Description mat sec4")
	public void user_clicks_on_manage_description_mat_sec4() {
	   MS4.clickSectionDesc();
	}
	@Then("user enter input to Manage Description mat sec4")
	public void user_enter_input_to_manage_description_mat_sec4() {
	    MS4.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks mat sec4")
	public void user_clicks_on_manage_feedbacks_mat_sec4() {
	    MS4.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks mat sec4")
	public void user_enter_input_to_feedbacks_mat_sec4() {
	    MS4.enterfeedbackML1();
	    MS4.enterfeedbackML2();
	    MS4.enterfeedbackML3();
	    MS4.enterfeedbackML4();
	    MS4.enterfeedbackML5();
	    MS4.entershortSummML1();
	    MS4.entershortSummML2();
	    MS4.entershortSummML3();
	    MS4.entershortSummML4();
	    MS4.entershortSummML5();
	    MS4.enterNxtSteps1();
	    MS4.enterNxtSteps2();
	    MS4.enterNxtSteps3();
	    MS4.enterNxtSteps4();
	    MS4.enterNxtSteps5();
	}
	@Then("user clicks on Add Question mat sec4")
	public void user_clicks_on_add_question_mat_sec4() {
	   MS4.clickAddQns();
	}
	@Then("user enters question mat sec4")
	public void user_enters_question_mat_sec4() {
	    MS4.enterQns();
	}
	@Then("user selects answer type mat sec4")
	public void user_selects_answer_type_mat_sec4() {
		MS4.clickAnswerType();
		MS4.selectAnswerType();
	}
	@Then("user clicks Add Answer, enters choice, enters score mat sec4")
	public void user_clicks_add_answer_enters_choice_enters_score_mat_sec4() {
		MS4.clickAddAnswer();
		MS4.enterChoiceLabel();
		MS4.enterScore();
	}
	@Then("user clicks Add Answer2,enters choice2,enters score2 mat sec4")
	public void user_clicks_add_answer2_enters_choice2_enters_score2_mat_sec4() {
		MS4.clickAddAnswer1();
		MS4.enterChoiceLabel1();
		MS4.enterScore1();
	}
	@Then("click on save mat sec4")
	public void clicks_on_save_mat_sec4() throws InterruptedException {
	  MS4.clickSave();
	}

//Adding Yes or No Maturity Type
	
	@When("user clicks on template section5")
	public void user_clicks_on_template_section5() {
		MS5 = new Maturity_Yes_No(driver);
		   MS5.clickonTemplate();
	}
	@Then("user clicks on ADD New Section mat sec5")
	public void user_clicks_on_add_new_section_mat_sec5() {
	    MS5.clickAddSection();
	}
	@Then("user enters section Name mat sec5")
	public void user_enters_section_name_mat_sec5() {
	    MS5.enterSectionName();
	}
	@Then("user clicks on manage Description mat sec5")
	public void user_clicks_on_manage_description_mat_sec5() {
	    MS5.clickSectionDesc();
	}
	@Then("user enter input to Manage Description mat sec5")
	public void user_enter_input_to_manage_description_mat_sec5() {
	    MS5.enterSectionDesc();
	}
	@Then("user clicks on manage Feedbacks mat sec5")
	public void user_clicks_on_manage_feedbacks_mat_sec5() {
		MS5.clickManageFeedbacks();
	}
	@Then("user enter input to feedbacks mat sec5")
	public void user_enter_input_to_feedbacks_mat_sec5() {
	 
		MS5.enterfeedbackML1();
	    MS5.enterfeedbackML2();
	    MS5.enterfeedbackML3();
	    MS5.enterfeedbackML4();
	    MS5.enterfeedbackML5();
	    MS5.entershortSummML1();
	    MS5.entershortSummML2();
	    MS5.entershortSummML3();
	    MS5.entershortSummML4();
	    MS5.entershortSummML5();
	    MS5.enterNxtSteps1();
	    MS5.enterNxtSteps2();
	    MS5.enterNxtSteps3();
	    MS5.enterNxtSteps4();
	    MS5.enterNxtSteps5();
	}
	@Then("user clicks on Add Question mat sec5")
	public void user_clicks_on_add_question_mat_sec5() {
		MS5.clickAddQns();
	}
	@Then("user enters question mat sec5")
	public void user_enters_question_mat_sec5() {
	MS5.enterQns();
	}
	@And("user selects answer type mat sec5")
	public void user_selects_answer_type_mat_sec5() {
		MS5.clickAnswerType();
		MS5.selectAnswerType();
	}
	@Then("click on save mat sec5")
	public void clicks_on_save_mat_sec5() throws InterruptedException {
	MS5.clickSave();
		Thread.sleep(3000);
	}
}
