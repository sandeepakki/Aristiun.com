package PageObjectsMaturity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Maturity1_10Slider {

	public WebDriver ldriver;
	WaitHelper waithelper;
	public Maturity1_10Slider(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//span[text()='Maturity-Type-Assessment']")
	public WebElement template;
	
	@FindBy(xpath="//button[@type='button']/i")
	public WebElement AddSection;
	
	@FindBy(name="sections[0].name")
	public WebElement sectionName;
	
	@FindBy(xpath="//span[text()='Manage Description']")
	public WebElement sectionDesc;
	
	@FindBy(xpath="//label[text()='Section Description']/..//div[@class='ql-editor ql-blank']")
	public WebElement enterDesc;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/"+
	"div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/button[1]")
	public WebElement secFeedbacks;
	
	@FindBy(xpath="//label[text()='Feedback for Maturity Level 1']/..//div[@class='ql-editor ql-blank']")
	public WebElement FDML1;
	
	@FindBy(xpath="//label[text()='Feedback for Maturity Level 2']/..//div[@class='ql-editor ql-blank']")
	public WebElement FDML2;
	
	@FindBy(xpath="//label[text()='Feedback for Maturity Level 3']/..//div[@class='ql-editor ql-blank']")
	public WebElement FDML3;
	
	@FindBy(xpath="//label[text()='Feedback for Maturity Level 4']/..//div[@class='ql-editor ql-blank']")
	public WebElement FDML4;
	
	@FindBy(xpath="//label[text()='Feedback for Maturity Level 5']/..//div[@class='ql-editor ql-blank']")
	public WebElement FDML5;
	
	@FindBy(name="sections[0].maturity_short_summary_level_1")
	public WebElement shortSummML1;
	
	@FindBy(name="sections[0].maturity_short_summary_level_2")
	public WebElement shortSummML2;
	
	@FindBy(name="sections[0].maturity_short_summary_level_3")
	public WebElement shortSummML3;
	
	@FindBy(name="sections[0].maturity_short_summary_level_4")
	public WebElement shortSummML4;
	
	@FindBy(name="sections[0].maturity_short_summary_level_5")
	public WebElement shortSummML5;
	
	@FindBy(name="sections[0].maturity_next_steps_level_1")
	public WebElement NxtStepsLevel1;
	
	@FindBy(name="sections[0].maturity_next_steps_level_2")
	public WebElement NxtStepsLevel2;
	
	@FindBy(name="sections[0].maturity_next_steps_level_3")
	public WebElement NxtStepsLevel3;
	
	@FindBy(name="sections[0].maturity_next_steps_level_4")
	public WebElement NxtStepsLevel4;

	@FindBy(name="sections[0].maturity_next_steps_level_5")
	public WebElement NxtStepsLevel5;
	
	@FindBy(xpath="//button[@class='mb-4 btn btn-outline-primary btn-sm']")
	public WebElement AddQns;
	
	@FindBy(name="sections[0].questions[0].question")
	public WebElement enterQns;
	
	@FindBy(xpath="//label[text()='Answer Type']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clAnswertype;
	
	@FindBy(xpath="//div[text()='1-10 Slider']")
	public WebElement slAnswerType;
	
	@FindBy(xpath="//label[text()='Standards']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clstandard;
	
	@FindBy(xpath="//div[text()='NIST CSF']")
	public WebElement slstandard;
	
	@FindBy(xpath="//label[text()='Response Type']/..//div[@class='react-select__control css-yk16xz-control'][1]")
	public WebElement clresponse;
	
	@FindBy(xpath="//div[text()='Positive']")
	public WebElement slresponse;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement save;
	
	
	//Actions
	public void clickonTemplate() {
		waithelper.WaitForElement(template,20);
		template.click();
	}
	
	public void clickAddSection() {
		waithelper.WaitForElement(AddSection,20);
		AddSection.click();
	}
	public void enterSectionName(){
		waithelper.WaitForElement(sectionName,20);
			sectionName.clear();
			sectionName.sendKeys("1");
		
	}
	public void clickSectionDesc() {
		waithelper.WaitForElement(sectionDesc,20);
		sectionDesc.click();
	}
	public void enterSectionDesc() {
		waithelper.WaitForElement(enterDesc,20);
		enterDesc.sendKeys("This is section1 description");
	}
	public void clickManageFeedbacks() {
		waithelper.WaitForElement(secFeedbacks,20);
		secFeedbacks.click();
	}
	public void enterfeedbackML1() {
		waithelper.WaitForElement(FDML1,20);
		FDML1.sendKeys("This is Section1 Feedback Maturity Level 1");
	}
	public void enterfeedbackML2() {
		waithelper.WaitForElement(FDML2,20);
		FDML2.sendKeys("This is Section1 Feedback Maturity Level 2");
	}
	public void enterfeedbackML3() {
		waithelper.WaitForElement(FDML3,20);
		FDML3.sendKeys("This is Section1 Feedback Maturity Level 3");
	}
	public void enterfeedbackML4() {
		waithelper.WaitForElement(FDML4,20);
		FDML4.sendKeys("This is Section1 Feedback Maturity Level 4");
	}
	public void enterfeedbackML5() {
		waithelper.WaitForElement(FDML5,20);
		FDML5.sendKeys("This is Section1 Feedback Maturity Level 5");
	}
	public void entershortSummML1() {
		waithelper.WaitForElement(shortSummML1,20);
		shortSummML1.sendKeys("This is Short Summary for Maturity Level 1 section1");
	}
	public void entershortSummML2() {
		waithelper.WaitForElement(shortSummML2,20);
		shortSummML2.sendKeys("This is Short Summary for Maturity Level 2 section1");
	}
	public void entershortSummML3() {
		waithelper.WaitForElement(shortSummML3,20);
		shortSummML3.sendKeys("This is Short Summary for Maturity Level 3 Section1");
	}
	public void entershortSummML4() {
		waithelper.WaitForElement(shortSummML3,20);
		shortSummML4.sendKeys("This is Short Summary for Maturity Level 4 section1");
	}
	public void entershortSummML5() {
		waithelper.WaitForElement(shortSummML5,20);
		shortSummML5.sendKeys("This is Short Summary for Maturity Level 5 section1");
	}
	public void enterNxtSteps1() {
		waithelper.WaitForElement(NxtStepsLevel1,20);
		NxtStepsLevel1.sendKeys("This is Next Steps for Maturity Level 1 Section1");
	}
	public void enterNxtSteps2() {
		waithelper.WaitForElement(NxtStepsLevel2,20);
		NxtStepsLevel2.sendKeys("This is Next Steps for Maturity Level 2 Section1");
	}
	public void enterNxtSteps3() {
		waithelper.WaitForElement(NxtStepsLevel3,20);
		NxtStepsLevel3.sendKeys("This is Next Steps for Maturity Level 3 Section1");
	}
	public void enterNxtSteps4() {
		waithelper.WaitForElement(NxtStepsLevel4,20);
		NxtStepsLevel4.sendKeys("This is Next Steps for Maturity Level 4 Section1");
	}
	public void enterNxtSteps5() {
		waithelper.WaitForElement(NxtStepsLevel5,20);
		NxtStepsLevel5.sendKeys("This is Next Steps for Maturity Level 5 Section1");
	}
	public void clickAddQns() {
		waithelper.WaitForElement(AddQns,20);
		AddQns.click();
	}
	public void enterQns(){
		waithelper.WaitForElement(enterQns,20);
			enterQns.clear();
			enterQns.sendKeys("1");
		
	}
	public void clickAnswerType() {
		waithelper.WaitForElement(clAnswertype,20);
		clAnswertype.click();
	}
	public void selectAnswerType() {
		waithelper.WaitForElement(slAnswerType, 20);
		slAnswerType.click();
	}
	
	public void clickStandard() {
		waithelper.WaitForElement(clstandard,20);
		clstandard.click();
	}
	public void selectStandard() {
		waithelper.WaitForElement(slstandard,20);
		slstandard.click();
	}
	public void clickResponseType() {
		waithelper.WaitForElement(clresponse,20);
		clresponse.click();
	}
	
	public void selectResponseType() {
		waithelper.WaitForElement(slresponse,20);
		slresponse.click();
	}
	public void clickSave() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		save.click();
	}

}
