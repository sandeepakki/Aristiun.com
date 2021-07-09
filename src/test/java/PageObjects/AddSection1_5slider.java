package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class AddSection1_5slider {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	public AddSection1_5slider(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//span[text()='PassingType-Assessment']")
	public WebElement template;
	
	@FindBy(xpath="//button[@class='mb-3 btn btn-outline-primary btn-lg']/i")
	public WebElement AddSection;
	
	@FindBy(name="sections[1].name")
	public WebElement sectionName;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]")
	public WebElement sectionDesc;
	
	@FindBy(xpath="//label[text()='Section Description']/..//div[@class='ql-editor ql-blank']")
	public WebElement enterDesc;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/div[1]/div[3]/button[1]")
	public WebElement secFeedbacks;
	
	@FindBy(xpath="//label[text()=' Section Passing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectPassFeed;
	
	@FindBy(xpath="//label[text()=' Section Failing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectFailFeed;
	
	@FindBy(name="sections[1].passing_short_summary")
	public WebElement sectPassSumm;
	
	@FindBy(name="sections[1].failing_short_summary")
	public WebElement sectFailSumm;
	
	@FindBy(name="sections[1].passing_next_step")
	public WebElement sectPassNxtStep;
	
	@FindBy(name="sections[1].failing_next_step")
	public WebElement sectFailNxtStep;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/"+
	"div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/button[1]")
	public WebElement AddQns;
	
	@FindBy(name="sections[1].questions[0].question")
	public WebElement enterQns;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/"+
	"div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clAnswertype;
	
	@FindBy(xpath="//div[text()='1-5 Slider']")
	public WebElement slAnswerType;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clstandard;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement slstandard;
	
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
			sectionName.sendKeys("2");
		
	}
	public void clickSectionDesc() {
		waithelper.WaitForElement(sectionDesc,20);
		sectionDesc.click();
		}
	public void enterSectionDesc() {
		waithelper.WaitForElement(enterDesc,20);
		 enterDesc.sendKeys("This is section2");
	}
	public void clickManageFeedbacks() {
		waithelper.WaitForElement(secFeedbacks,20);
			secFeedbacks.click();
	}
	public void enterSecPassFeed() {
		waithelper.WaitForElement(sectPassFeed,20);
		sectPassFeed.sendKeys("This is Passing feedback sec2");
	}
	public void entersectFailFeed() {
		waithelper.WaitForElement(sectFailFeed,20);
		sectFailFeed.sendKeys("This is Failing Feedback sec2");
	}
	public void entersectPassSumm() {
		waithelper.WaitForElement(sectPassSumm,20);
		sectPassSumm.sendKeys("This is Pass summary sec2");
	}
	public void entersectFailSumm() {
		waithelper.WaitForElement(sectFailSumm,20);
		sectFailSumm.sendKeys("This is Fail summary sec2");
	}
	public void entersectPassNxtStep() {
		waithelper.WaitForElement(sectPassNxtStep,20);
		sectPassNxtStep.sendKeys("This is pass next step sec2");
	}
	public void entersectFailNxtStep() {
		waithelper.WaitForElement(sectFailNxtStep,20);
		sectFailNxtStep.sendKeys("This is Fail next step sec2");
	}
	
	public void clickAddQns() {
		waithelper.WaitForElement(AddQns,20);
		AddQns.click();		
	}
	public void enterQns(){
		waithelper.WaitForElement(enterQns,20);
			enterQns.clear();
			enterQns.sendKeys("2");
		
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
	public void selectStandard() throws InterruptedException {
		waithelper.WaitForElement(slstandard,20);
		slstandard.click();
		Thread.sleep(2000);
	}
	public void clickSave() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,-750)");
		waithelper.WaitForElement(save,20);
		Thread.sleep(3000);
		save.click();
	}
}
