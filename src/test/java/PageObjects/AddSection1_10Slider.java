package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.WaitHelper;

public class AddSection1_10Slider {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	public AddSection1_10Slider(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//span[text()='PassingType-Assessment']")
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
	
	@FindBy(xpath="//label[text()=' Section Passing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectPassFeed;
	
	@FindBy(xpath="//label[text()=' Section Failing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectFailFeed;
	
	@FindBy(name="sections[0].passing_short_summary")
	public WebElement sectPassSumm;
	
	@FindBy(name="sections[0].failing_short_summary")
	public WebElement sectFailSumm;
	
	@FindBy(name="sections[0].passing_next_step")
	public WebElement sectPassNxtStep;
	
	@FindBy(name="sections[0].failing_next_step")
	public WebElement sectFailNxtStep;
	
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
	public void enterSecPassFeed() {
		waithelper.WaitForElement(sectPassFeed,20);
		sectPassFeed.sendKeys("This is Passing feedback");
	}
	public void entersectFailFeed() {
		waithelper.WaitForElement(sectFailFeed,20);
		sectFailFeed.sendKeys("This is Failing Feedback");
	}
	public void entersectPassSumm() {
		waithelper.WaitForElement(sectPassSumm,20);
		sectPassSumm.sendKeys("This is Pass summary");
	}
	public void entersectFailSumm() {
		waithelper.WaitForElement(sectFailSumm,20);
		sectFailSumm.sendKeys("This is Fail summary");
	}
	public void entersectPassNxtStep() {
		waithelper.WaitForElement(sectPassNxtStep,20);
		sectPassNxtStep.sendKeys("This is pass next step");
	}
	public void entersectFailNxtStep() {
		waithelper.WaitForElement(sectFailNxtStep,20);
		sectFailNxtStep.sendKeys("This is Fail next step");
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


