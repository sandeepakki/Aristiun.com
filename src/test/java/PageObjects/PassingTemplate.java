package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PassingTemplate {
	
	public WebDriver ldriver;
	
	public PassingTemplate(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	By lnkAssessment = By.linkText("Assessments");
	By lnkTemplate = By.linkText("Templates");
	By AddNewbtn = By.xpath("//button[contains(text(),'Add New')]");
	By tempname = By.name("name");
	By AssmType = By.xpath("//div[contains(text(),'Consulting Assessment')]");
	By FdbType = By.xpath("//div[contains(text(),'Passing Feedback')]");
	By ScorePatt = By.xpath("//div[contains(text(),'Sum')]");
	By TemplateIntro = By.xpath("//div[@class='ql-editor ql-blank'][1]");
	By ExeIntro = By.xpath("//label[text()='Executive Introduction']/..//div[@class='ql-editor ql-blank']");
	By PassSumm = By.xpath("//label[text()='Passing Summary']/..//div[@class='ql-editor ql-blank']");
	By FailSumm = By.xpath("//label[text()='Failing Summary']/..//div[@class='ql-editor ql-blank']");
	By PassNxtSteps = By.xpath("//label[text()='Passing Next Steps']/..//div[@class='ql-editor ql-blank']");
	By FailNxtSteps = By.xpath("//label[text()='Failing Next Steps']/..//div[@class='ql-editor ql-blank']");
	By AbtTemp = By.xpath("//label[text()='About Template']/..//div[@class='ql-editor ql-blank']");
	By AddBtn = By.xpath("//button[@type='submit']");
	By SaveBtn = By.xpath("//span[text()='Save']");
	By success = By.tagName("h4");
	
//Action Methods
	 
	public void clickonAssessment() {
		ldriver.findElement(lnkAssessment).click();
	}
	public void clickonTemplate() {
		ldriver.findElement(lnkTemplate).click();
	}
	public void clickonAddNewButton() {
		ldriver.findElement(AddNewbtn).click();
	}
	public void settempName() {
		ldriver.findElement(tempname).sendKeys("PassingType-Assessment");
	}
	public void setAssmType() {
		ldriver.findElement(AssmType).click();
	}
	public void setFdbType() {
		ldriver.findElement(FdbType).click();
	}
	public void setScorePatt() {
		ldriver.findElement(ScorePatt).click();
	}
	public void enterTempIntro() {
		ldriver.findElement(TemplateIntro).sendKeys("this is test template intro");
	}
	public void enterExeIntro() {
		ldriver.findElement(ExeIntro).sendKeys("this is test template executive intro");
	}
	public void enterPassSumm() {
		ldriver.findElement(PassSumm).sendKeys("This is test template pass summary");
	}
	public void enterFailSumm() {
		ldriver.findElement(FailSumm).sendKeys("This is test template fail summary");
	}
	public void enterPassNxtSteps() {
		ldriver.findElement(PassNxtSteps).sendKeys("This is test template pass nxt steps");
	}
	public void enterFailNxtSteps() {
		ldriver.findElement(FailNxtSteps).sendKeys("This is test template fail nxt steps");
	}
	public void enterAbtTemp() {
		ldriver.findElement(AbtTemp).sendKeys("This is about test template");
	}
	public void clickonAddBtn() {
		ldriver.findElement(AddBtn).click();
	}
	public void clickonSavebtn() {
		ldriver.findElement(SaveBtn).click();
	}
	public void successmsg() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(ldriver.findElement(success).getText()
				.contains("Template saved successfully"));
	}
}
