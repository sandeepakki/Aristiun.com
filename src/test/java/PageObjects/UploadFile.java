package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class UploadFile {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	public UploadFile(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//span[text()='PassingType-Assessment']")
	public WebElement template;
	
	@FindBy(xpath="//button[@class='mb-3 btn btn-outline-primary btn-lg']/i")
	public WebElement AddSection;
	
	@FindBy(name="sections[6].name")
	public WebElement sectionName;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[19]/div[2]/div[1]/div[2]/button[1]/span[1]")
	public WebElement sectionDesc;
	
	@FindBy(xpath="//label[text()='Section Description']/..//div[@class='ql-editor ql-blank']")
	public WebElement enterDesc;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[19]/div[2]/div[1]/div[5]/div[1]/div[3]/button[1]")
	public WebElement secFeedbacks;
	
	@FindBy(xpath="//label[text()=' Section Passing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectPassFeed;
	
	@FindBy(xpath="//label[text()=' Section Failing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectFailFeed;
	
	@FindBy(name="sections[6].passing_short_summary")
	public WebElement sectPassSumm;
	
	@FindBy(name="sections[6].failing_short_summary")
	public WebElement sectFailSumm;
	
	@FindBy(name="sections[6].passing_next_step")
	public WebElement sectPassNxtStep;
	
	@FindBy(name="sections[6].failing_next_step")
	public WebElement sectFailNxtStep;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/"+
	"div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[21]/button[1]")
	public WebElement AddQns;
	
	@FindBy(name="sections[6].questions[0].question")
	public WebElement enterQns;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[20]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clAnswertype;
	
	@FindBy(xpath="//div[text()='Upload file']")
	public WebElement slAnswerType;
	
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
			sectionName.sendKeys("7");
		
	}
	public void clickSectionDesc() {
		waithelper.WaitForElement(sectionDesc,20);
		sectionDesc.click();
		}
	public void enterSectionDesc() {
		waithelper.WaitForElement(enterDesc,20);
		 enterDesc.sendKeys("This is section7 - Upload File type");
	}
	public void clickManageFeedbacks() {
		waithelper.WaitForElement(secFeedbacks,20);
			secFeedbacks.click();
	}
	public void enterSecPassFeed() {
		waithelper.WaitForElement(sectPassFeed,20);
		sectPassFeed.sendKeys("This is Passing feedback sec7");
	}
	public void entersectFailFeed() {
		waithelper.WaitForElement(sectFailFeed,20);
		sectFailFeed.sendKeys("This is Failing Feedback sec7");
	}
	public void entersectPassSumm() {
		waithelper.WaitForElement(sectPassSumm,20);
		sectPassSumm.sendKeys("This is Pass summary sec7");
	}
	public void entersectFailSumm() {
		waithelper.WaitForElement(sectFailSumm,20);
		sectFailSumm.sendKeys("This is Fail summary sec7");
	}
	public void entersectPassNxtStep() {
		waithelper.WaitForElement(sectPassNxtStep,20);
		sectPassNxtStep.sendKeys("This is pass next step sec7");
	}
	public void entersectFailNxtStep() {
		waithelper.WaitForElement(sectFailNxtStep,20);
		sectFailNxtStep.sendKeys("This is Fail next step sec7");
	}
	
	public void clickAddQns() {
		waithelper.WaitForElement(AddQns,20);
		AddQns.click();		
	}
	public void enterQns(){
		waithelper.WaitForElement(enterQns,20);
			enterQns.clear();
			enterQns.sendKeys("7");
		
	}
	public void clickAnswerType() {
		waithelper.WaitForElement(clAnswertype,20);
		clAnswertype.click();
	
	}
	public void selectAnswerType() {
		waithelper.WaitForElement(slAnswerType, 20);
		slAnswerType.click();
	}
	public void clickSave() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		for(int i=0;i<=1;i++) {
		js.executeScript("window.scrollBy(0,-1200)");
		}
		waithelper.WaitForElement(save,20);
		Thread.sleep(3000);
		save.click();
	}


}
