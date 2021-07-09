package PageObjectsMaturity;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MaturityTemplate {

public WebDriver ldriver;
	
	public MaturityTemplate(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	By lnkAssessment = By.linkText("Assessments");
	By lnkTemplate = By.linkText("Templates");
	By AddNewbtn = By.xpath("//button[contains(text(),'Add New')]");
	By tempname = By.name("name");
	By clAssmType = By.xpath("//label[contains(text(),'Assessment Type')]/..//div[@class='react-select__control css-yk16xz-control']");
	By slAssmType = By.xpath("//div[contains(text(),'Internal Assessment')]");
	By clFdbType = By.xpath("//label[contains(text(),'Feedback Type')]/..//div[@class='react-select__control css-yk16xz-control']");
	By slFdbType = By.xpath("//div[contains(text(),'Maturity Feedback')]");
	By clScorePatt = By.xpath("//label[text()='Scoring Pattern']/..//div[@class='react-select__control css-yk16xz-control']");
	By slScorePatt = By.xpath("//div[text()='Sum']");
	By TemplateIntro = By.xpath("//div[@class='ql-editor ql-blank'][1]");
	By ExeIntro = By.xpath("//label[text()='Executive Introduction']/..//div[@class='ql-editor ql-blank']");
	By AvgSummary1 = By.xpath("//label[text()='Summary for Average Maturity Level 1']/..//div[@class='ql-editor ql-blank']");
	By AvgSummary2 = By.xpath("//label[text()='Summary for Average Maturity Level 2']/..//div[@class='ql-editor ql-blank']");
	By AvgSummary3 = By.xpath("//label[text()='Summary for Average Maturity Level 3']/..//div[@class='ql-editor ql-blank']");
	By AvgSummary4 = By.xpath("//label[text()='Summary for Average Maturity Level 4']/..//div[@class='ql-editor ql-blank']");
	By AvgSummary5 = By.xpath("//label[text()='Summary for Average Maturity Level 5']/..//div[@class='ql-editor ql-blank']");
	By NxtSteps1 = By.xpath("//label[text()='Next Steps for Average Maturity Level 1']/..//div[@class='ql-editor ql-blank']");
	By NxtSteps2 = By.xpath("//label[text()='Next Steps for Average Maturity Level 2']/..//div[@class='ql-editor ql-blank']");
	By NxtSteps3 = By.xpath("//label[text()='Next Steps for Average Maturity Level 3']/..//div[@class='ql-editor ql-blank']");
	By NxtSteps4 = By.xpath("//label[text()='Next Steps for Average Maturity Level 4']/..//div[@class='ql-editor ql-blank']");
	By NxtSteps5 = By.xpath("//label[text()='Next Steps for Average Maturity Level 5']/..//div[@class='ql-editor ql-blank']");
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
		ldriver.findElement(tempname).sendKeys("Maturity-Type-Assessment");
	}
	public void clickAssmType() {
		ldriver.findElement(clAssmType).click();
	}
	public void selectAssmType() {
		ldriver.findElement(slAssmType).click();
	}
	public void clickFdbType() {
		ldriver.findElement(clFdbType).click();
	}
	public void selectFdbType() {
		ldriver.findElement(slFdbType).click();
	}
	public void clickScorePatt() {
		ldriver.findElement(clScorePatt).click();
	}
	public void selectScorePatt() {
		ldriver.findElement(slScorePatt).click();
	}
	public void enterTempIntro() {
		ldriver.findElement(TemplateIntro).sendKeys("this is test template intro");
	}
	public void enterExeIntro() {
		ldriver.findElement(ExeIntro).sendKeys("this is test template executive intro");
	}
	public void enterAvgSumm1() {
		ldriver.findElement(AvgSummary1).sendKeys("This is Summary for avg maturity level1");
	}
	public void enterAvgSumm2() {
		ldriver.findElement(AvgSummary2).sendKeys("This is Summary for avg maturity level2");
	}
	public void enterAvgSumm3() {
		ldriver.findElement(AvgSummary3).sendKeys("This is Summary for avg maturity level3");
	}
	public void enterAvgSumm4() {
		ldriver.findElement(AvgSummary4).sendKeys("This is Summary for avg maturity level4");
	}
	
	public void enterAvgSumm5() {
		ldriver.findElement(AvgSummary5).sendKeys("This is Summary for avg maturity level5");
	}
	
	public void enterNxtSteps1() {
		ldriver.findElement(NxtSteps1).sendKeys("This is Next Step for avg maturity level1");
	}
	public void enterNxtSteps2() {
		ldriver.findElement(NxtSteps2).sendKeys("This is Next Step for avg maturity level2");
	}
	public void enterNxtSteps3() {
		ldriver.findElement(NxtSteps3).sendKeys("This is Next Step for avg maturity level3");
	}
	public void enterNxtSteps4() {
		ldriver.findElement(NxtSteps4).sendKeys("This is Next Step for avg maturity level4");
	}
	
	public void enterNxtSteps5() {
		ldriver.findElement(NxtSteps5).sendKeys("This is Next Step for avg maturity level5");
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
		Thread.sleep(1000);
		Assert.assertTrue(ldriver.findElement(success).getText()
				.contains("Template saved successfully"));
	}

}
