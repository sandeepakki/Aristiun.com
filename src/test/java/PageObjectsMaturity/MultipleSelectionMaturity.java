package PageObjectsMaturity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class MultipleSelectionMaturity {

	public WebDriver ldriver;
	WaitHelper waithelper;
	public MultipleSelectionMaturity(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//span[text()='Maturity-Type-Assessment']")
	public WebElement template;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/"+
	"div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")
	public WebElement AddSection;
	
	@FindBy(name="sections[3].name")
	public WebElement sectionName;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/"+
	"div[1]/div[2]/form[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[2]/button[1]/span[1]")
	public WebElement sectionDesc;
	
	@FindBy(xpath="//label[text()='Section Description']/..//div[@class='ql-editor ql-blank']")
	public WebElement enterDesc;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/"+
	"div[1]/div[2]/form[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[5]/div[1]/div[3]/button[1]")
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
	
	@FindBy(name="sections[3].maturity_short_summary_level_1")
	public WebElement shortSummML1;
	
	@FindBy(name="sections[3].maturity_short_summary_level_2")
	public WebElement shortSummML2;
	
	@FindBy(name="sections[3].maturity_short_summary_level_3")
	public WebElement shortSummML3;
	
	@FindBy(name="sections[3].maturity_short_summary_level_4")
	public WebElement shortSummML4;
	
	@FindBy(name="sections[3].maturity_short_summary_level_5")
	public WebElement shortSummML5;
	
	@FindBy(name="sections[3].maturity_next_steps_level_1")
	public WebElement NxtStepsLevel1;
	
	@FindBy(name="sections[3].maturity_next_steps_level_2")
	public WebElement NxtStepsLevel2;
	
	@FindBy(name="sections[3].maturity_next_steps_level_3")
	public WebElement NxtStepsLevel3;
	
	@FindBy(name="sections[3].maturity_next_steps_level_4")
	public WebElement NxtStepsLevel4;

	@FindBy(name="sections[3].maturity_next_steps_level_5")
	public WebElement NxtStepsLevel5;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/"+
	"main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[12]/button[1]")
	public WebElement AddQns;
	
	@FindBy(name="sections[3].questions[0].question")
	public WebElement enterQns;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clAnswertype;
	
	@FindBy(xpath="//div[text()='Multiple Selection']")
	public WebElement slAnswerType;
	
	@FindBy(xpath= "//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/"+
	"div[1]/div[2]/form[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[6]/div[1]/button[1]")
	public WebElement clAdAns;
	
	@FindBy(name="sections[3].questions[0].choices[0].label")
	public WebElement choiceLabel;
	
	@FindBy(name="sections[3].questions[0].choices[0].score")
	public WebElement inputScore;
	
	@FindBy(xpath= "//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[6]/div[6]/button[1]")
	public WebElement clAdAns1;
	
	@FindBy(name="sections[3].questions[0].choices[1].label")
	public WebElement choiceLabel1;
	
	@FindBy(name="sections[3].questions[0].choices[1].score")
	public WebElement inputScore1;
	
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
			sectionName.sendKeys("4");
		
	}
	public void clickSectionDesc() {
		waithelper.WaitForElement(sectionDesc,20);
		sectionDesc.click();
	}
	public void enterSectionDesc() {
		waithelper.WaitForElement(enterDesc,20);
		enterDesc.sendKeys("This is section4 description");
	}
	public void clickManageFeedbacks() {
		waithelper.WaitForElement(secFeedbacks,20);
		secFeedbacks.click();
	}
	public void enterfeedbackML1() {
		waithelper.WaitForElement(FDML1,20);
		FDML1.sendKeys("This is Section4 Feedback Maturity Level 1");
	}
	public void enterfeedbackML2() {
		waithelper.WaitForElement(FDML2,20);
		FDML2.sendKeys("This is Section4 Feedback Maturity Level 2");
	}
	public void enterfeedbackML3() {
		waithelper.WaitForElement(FDML3,20);
		FDML3.sendKeys("This is Section4 Feedback Maturity Level 3");
	}
	public void enterfeedbackML4() {
		waithelper.WaitForElement(FDML4,20);
		FDML4.sendKeys("This is Section4 Feedback Maturity Level 4");
	}
	public void enterfeedbackML5() {
		waithelper.WaitForElement(FDML5,20);
		FDML5.sendKeys("This is Section4 Feedback Maturity Level 5");
	}
	public void entershortSummML1() {
		waithelper.WaitForElement(shortSummML1,20);
		shortSummML1.sendKeys("This is Short Summary for Maturity Level 1 section4");
	}
	public void entershortSummML2() {
		waithelper.WaitForElement(shortSummML2,20);
		shortSummML2.sendKeys("This is Short Summary for Maturity Level 2 section4");
	}
	public void entershortSummML3() {
		waithelper.WaitForElement(shortSummML3,20);
		shortSummML3.sendKeys("This is Short Summary for Maturity Level 3 Section4");
	}
	public void entershortSummML4() {
		waithelper.WaitForElement(shortSummML3,20);
		shortSummML4.sendKeys("This is Short Summary for Maturity Level 4 section4");
	}
	public void entershortSummML5() {
		waithelper.WaitForElement(shortSummML5,20);
		shortSummML5.sendKeys("This is Short Summary for Maturity Level 5 section4");
	}
	public void enterNxtSteps1() {
		waithelper.WaitForElement(NxtStepsLevel1,20);
		NxtStepsLevel1.sendKeys("This is Next Steps for Maturity Level 1 Section4");
	}
	public void enterNxtSteps2() {
		waithelper.WaitForElement(NxtStepsLevel2,20);
		NxtStepsLevel2.sendKeys("This is Next Steps for Maturity Level 2 Section4");
	}
	public void enterNxtSteps3() {
		waithelper.WaitForElement(NxtStepsLevel3,20);
		NxtStepsLevel3.sendKeys("This is Next Steps for Maturity Level 3 Section4");
	}
	public void enterNxtSteps4() {
		waithelper.WaitForElement(NxtStepsLevel4,20);
		NxtStepsLevel4.sendKeys("This is Next Steps for Maturity Level 4 Section4");
	}
	public void enterNxtSteps5() {
		waithelper.WaitForElement(NxtStepsLevel5,20);
		NxtStepsLevel5.sendKeys("This is Next Steps for Maturity Level 5 Section4");
	}
	public void clickAddQns() {
		waithelper.WaitForElement(AddQns,20);
		AddQns.click();
	}
	public void enterQns(){
		waithelper.WaitForElement(enterQns,20);
			enterQns.clear();
			enterQns.sendKeys("4");
		
	}
	public void clickAnswerType() {
		waithelper.WaitForElement(clAnswertype,20);
		clAnswertype.click();
	}
	public void selectAnswerType() {
		waithelper.WaitForElement(slAnswerType, 20);
		slAnswerType.click();
	}
	public void clickAddAnswer() {
		waithelper.WaitForElement(clAdAns,20);
		clAdAns.click();
		
	}
	public void enterChoiceLabel() {
		waithelper.WaitForElement(choiceLabel,20);
		choiceLabel.sendKeys("1");
		
	}
	public void enterScore() {
		waithelper.WaitForElement(inputScore,20);
		inputScore.sendKeys("1");
	}
	
	public void clickAddAnswer1() {
		waithelper.WaitForElement(clAdAns1,20);
		clAdAns1.click();
		
	}
	public void enterChoiceLabel1() {
		waithelper.WaitForElement(choiceLabel1,20);
		choiceLabel1.sendKeys("2");
		
	}
	public void enterScore1() {
		waithelper.WaitForElement(inputScore1,20);
		inputScore1.sendKeys("2");
		
	}
	public void clickSave() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		for(int i=0;i<=1;i++) {
		js.executeScript("window.scrollBy(0,-1000)");
		}
		Thread.sleep(2000);
		save.click();
	}
}
