package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class MultipleSelection {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	public MultipleSelection(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	@FindBy(xpath="//span[text()='PassingType-Assessment']")
	public WebElement template;
	
	@FindBy(xpath="//button[@class='mb-3 btn btn-outline-primary btn-lg']/i")
	public WebElement AddSection;
	
	@FindBy(name="sections[3].name")
	public WebElement sectionName;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[2]/button[1]/span[1]")
	public WebElement sectionDesc;
	
	@FindBy(xpath="//label[text()='Section Description']/..//div[@class='ql-editor ql-blank']")
	public WebElement enterDesc;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[5]/div[1]/div[3]/button[1]")
	public WebElement secFeedbacks;
	
	@FindBy(xpath="//label[text()=' Section Passing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectPassFeed;
	
	@FindBy(xpath="//label[text()=' Section Failing Feedback']/..//div[@class='ql-editor ql-blank']")
	public WebElement sectFailFeed;
	
	@FindBy(name="sections[3].passing_short_summary")
	public WebElement sectPassSumm;
	
	@FindBy(name="sections[3].failing_short_summary")
	public WebElement sectFailSumm;
	
	@FindBy(name="sections[3].passing_next_step")
	public WebElement sectPassNxtStep;
	
	@FindBy(name="sections[3].failing_next_step")
	public WebElement sectFailNxtStep;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/"+
	"div[1]/div[2]/form[1]/div[1]/div[1]/div[12]/button[1]")
	public WebElement AddQns;
	
	@FindBy(name="sections[3].questions[0].question")
	public WebElement enterQns;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clAnswertype;
	
	@FindBy(xpath="//div[text()='Multiple Selection']")
	public WebElement slAnswerType;
	
	@FindBy(xpath= "//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[6]/div[1]/button[1]")
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
	
	@FindBy(xpath= "//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[6]/div[11]/button[1]")
	public WebElement clAdAns2;
	
	@FindBy(name="sections[3].questions[0].choices[2].label")
	public WebElement choiceLabel2;
	
	@FindBy(name="sections[3].questions[0].choices[2].score")
	public WebElement inputScore2;
	
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
		 enterDesc.sendKeys("This is sectio4-multiple selection");
	}
	public void clickManageFeedbacks() {
		waithelper.WaitForElement(secFeedbacks,20);
			secFeedbacks.click();
	}
	public void enterSecPassFeed() {
		waithelper.WaitForElement(sectPassFeed,20);
		sectPassFeed.sendKeys("This is Passing feedback sec4");
	}
	public void entersectFailFeed() {
		waithelper.WaitForElement(sectFailFeed,20);
		sectFailFeed.sendKeys("This is Failing Feedback sec4");
	}
	public void entersectPassSumm() {
		waithelper.WaitForElement(sectPassSumm,20);
		sectPassSumm.sendKeys("This is Pass summary sec4");
	}
	public void entersectFailSumm() {
		waithelper.WaitForElement(sectFailSumm,20);
		sectFailSumm.sendKeys("This is Fail summary sec4");
	}
	public void entersectPassNxtStep() {
		waithelper.WaitForElement(sectPassNxtStep,20);
		sectPassNxtStep.sendKeys("This is pass next step sec4");
	}
	public void entersectFailNxtStep() {
		waithelper.WaitForElement(sectFailNxtStep,20);
		sectFailNxtStep.sendKeys("This is Fail next step sec4");
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
	public void clickAddAnswer2() {
		waithelper.WaitForElement(clAdAns2,20);
		clAdAns2.click();
		
	}
	public void enterChoiceLabel2() {
		waithelper.WaitForElement(choiceLabel2,20);
		choiceLabel2.sendKeys("3");
		
	}
	public void enterScore2() {
		waithelper.WaitForElement(inputScore2,20);
		inputScore2.sendKeys("3");
		
	}
	
	public void clickSave() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		for(int i=0;i<=1;i++) {
		js.executeScript("window.scrollBy(0,-1000)");
		}
		waithelper.WaitForElement(save,20);
		Thread.sleep(3000);
		save.click();
	}	
}
