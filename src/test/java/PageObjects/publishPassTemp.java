package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class publishPassTemp {

	public WebDriver ldriver;
	WaitHelper waithelper;
	public publishPassTemp(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//span[text()='PassingType-Assessment']")
	public WebElement template;
	
	@FindBy(xpath="//button[@class='dropdown-toggle-split btn-lg dropdown-toggle btn btn-primary btn-lg']")
	public WebElement clickToggle;
	
	@FindBy(xpath="//button[text()='Publish Assessment']")
	public WebElement pubAssess;
	
	@FindBy(xpath="//label[text()='Resources']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clickResource;
	
	@FindBy(xpath="//div[text()='Company X']")
	public WebElement selectResource;
	
	
	@FindBy(xpath="//label[text()='Reviewers']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clickReviewer;
	
	@FindBy(xpath="//div[text()='sandeep QA']")
	public WebElement selectReviewer;
	
	@FindBy(xpath="//label[text()='Allow Editing']")
	public WebElement tickAllowEdit;
	
	@FindBy(xpath="//label[text()='Allow Partial Save']")
	public WebElement tickAllowPartialSave;
	
	@FindBy(xpath="//span[text()=' Next ']")
	public WebElement clickNext;
	
	@FindBy(xpath="//label[text()='Allow Categories']")
	public WebElement tickAllowCategories;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CatName1;
	
	@FindBy(xpath="//button[text()='Manage Feedbacks '][1]")
	public WebElement ManageFeedbacks1;
	
	@FindBy(xpath="//label[text()='Passing Feedback']/..//div[@class='ql-editor ql-blank'][1]")
	public WebElement enterPassFeed1;
	
	@FindBy(xpath="//label[text()='Failing Feedback']/..//div[@class='ql-editor ql-blank'][1]")
	public WebElement enterFailFeed1;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/input[1]")
	public WebElement CatName2;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[2]/button[1]")
	public WebElement ManageFeedbacks2;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]")
	public WebElement enterPassFeed2;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]")
	public WebElement enterFailFeed2;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[1]")
	public WebElement CatName3;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[3]/button[1]")
	public WebElement ManageFeedbacks3;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]")
	public WebElement enterPassFeed3;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]")
	public WebElement enterFailFeed3;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/input[1]")
	public WebElement CatName4;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[4]/button[1]")
	public WebElement ManageFeedbacks4;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/div[1]")
	public WebElement enterPassFeed4;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/"+
	"form[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[3]/div[2]/div[1]/div[2]/div[1]")
	public WebElement enterFailFeed4;
	
	@FindBy(xpath="//label[text()='Show descriptions of questions in report']")
	public WebElement showQnsDesc;
	
	@FindBy(xpath="//label[text()='Show summary in report']")
	public WebElement showSumm;
	
	@FindBy(xpath="//label[text()='Show next steps in report']")
	public WebElement showNxtSteps;
	
	@FindBy(xpath="//label[text()='Show Heat map in report']")
	public WebElement showheatmap;
	
	@FindBy(xpath="//label[text()='Show super section in assessment & report']")
	public WebElement showSuperSection;
	
	@FindBy(xpath="//span[text()=' Next ']")
	public WebElement clickNext2;
	
	@FindBy(xpath="//label[text()='Generate Executive Report']")
	public WebElement GeneratingExecutiveReport;
	
	@FindBy(xpath="//span[text()='Exec Report - Rows (3 Page)']")
	public WebElement select3Row;
	
	@FindBy(xpath="//label[text()='Select graph to display in executive file']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clickGraph;
	
	@FindBy(xpath="//div[text()='Radar']")
	public WebElement selectGraph;

	@FindBy(xpath="//span[text()=' Publish ']")
	public WebElement clickPublish;
	
//Actions
	
	public void clickonTemplate() {
		waithelper.WaitForElement(template,20);
		template.click();
	}
	
	public void clickToggle() {
		waithelper.WaitForElement(clickToggle,20);
		clickToggle.click();
	}
	public void clickpubAssess() {
		waithelper.WaitForElement(pubAssess,20);
		pubAssess.click();
	}
	public void clickonResource() {
		waithelper.WaitForElement(clickResource,20);
		clickResource.click();
	}
	
	public void selectResource() {
		waithelper.WaitForElement(selectResource,20);
		selectResource.click();
	}
	
	public void clickonReviewer() {
		waithelper.WaitForElement(clickReviewer,20);
		clickReviewer.click();
	}
	
	public void selectReviewer() {
		waithelper.WaitForElement(selectReviewer,20);
		selectReviewer.click();
	}
	
	public void clickAllowEdit() {
		waithelper.WaitForElement(tickAllowEdit,20);
		tickAllowEdit.click();
	}
	
	public void clickPartialSave() {
		waithelper.WaitForElement(tickAllowPartialSave,20);
		tickAllowPartialSave.click();
	}
	
	public void clickNext() {
		waithelper.WaitForElement(clickNext,20);
		clickNext.click();
	}
	
	public void clickAllowCategories() {
		waithelper.WaitForElement(tickAllowCategories,20);
		tickAllowCategories.click();
	}
	
	public void enterCategory1() {
		waithelper.WaitForElement(CatName1,20);
		CatName1.sendKeys("CT1");
	}
	
	public void clickManageFeedbacks1() {
		waithelper.WaitForElement(ManageFeedbacks1,20);
		ManageFeedbacks1.click();
	}
	
	public void enterpassfeed1() {
		waithelper.WaitForElement(enterPassFeed1,20);
		enterPassFeed1.sendKeys("Overall Passing Feedback sections 1 & 2");
	}
	
	public void enterfailfeed1() {
		waithelper.WaitForElement(enterFailFeed1,20);
		enterFailFeed1.sendKeys("Overall Failing Feedback sections 1 & 2");
	}
	
	public void enterCategory2() {
		waithelper.WaitForElement(CatName2,20);
		CatName2.sendKeys("CT2");
	}
	
	public void clickManageFeedbacks2() {
		waithelper.WaitForElement(ManageFeedbacks2,20);
		ManageFeedbacks2.click();
	}
	
	public void enterpassfeed2() {
		waithelper.WaitForElement(enterPassFeed2,20);
		enterPassFeed1.sendKeys("Overall Passing Feedback sections 3 & 4");
	}
	
	public void enterfailfeed2() {
		waithelper.WaitForElement(enterFailFeed2,20);
		enterFailFeed1.sendKeys("Overall Failing Feedback sections 3 & 4");
	}
	
	public void enterCategory3() {
		waithelper.WaitForElement(CatName3,20);
		CatName3.sendKeys("CT3");
	}
	
	public void clickManageFeedbacks3() {
		waithelper.WaitForElement(ManageFeedbacks3,20);
		ManageFeedbacks3.click();
	}
	
	public void enterpassfeed3() {
		waithelper.WaitForElement(enterPassFeed3,20);
		enterPassFeed3.sendKeys("Overall Passing Feedback sections 5 & 6");
	}
	
	public void enterfailfeed3() {
		waithelper.WaitForElement(enterFailFeed3,20);
		enterFailFeed3.sendKeys("Overall Failing Feedback sections 5 & 6");
	}
	
	public void enterCategory4() {
		waithelper.WaitForElement(CatName4,20);
		CatName4.sendKeys("CT4");
	}
	
	public void clickManageFeedbacks4() {
		waithelper.WaitForElement(ManageFeedbacks4,20);
		ManageFeedbacks4.click();
	}
	
	public void enterpassfeed4() {
		waithelper.WaitForElement(enterPassFeed4,20);
		enterPassFeed4.sendKeys("Overall Passing Feedback sections 7 & 8");
	}
	
	public void enterfailfeed4() {
		waithelper.WaitForElement(enterFailFeed4,20);
		enterFailFeed4.sendKeys("Overall Failing Feedback sections 7 & 8");
	}
	
	public void clickShowQnsDesc() {
		waithelper.WaitForElement(showQnsDesc,20);
		showQnsDesc.click();
	}
	
	public void clickshowSumm() {
		waithelper.WaitForElement(showSumm,20);
		showSumm.click();
	}
	
	public void clickshowNxtSteps() {
		waithelper.WaitForElement(showNxtSteps,20);
		showNxtSteps.click();
	}
	
	public void clickshowheatmap() {
		waithelper.WaitForElement(showheatmap,20);
		showheatmap.click();
	}
	
	public void clickshowSuperSection() {
		waithelper.WaitForElement(showSuperSection,20);
		showSuperSection.click();
	}
	
	public void clickNext2() {
		waithelper.WaitForElement(clickNext2,20);
        clickNext2.click();
	}
	public void GeneratingExecutiveReport() {
		waithelper.WaitForElement(GeneratingExecutiveReport,20);
		GeneratingExecutiveReport.click();
	}
	
	public void select3Row() {
		waithelper.WaitForElement(select3Row,20);
		select3Row.click();
	}
	
	public void clickGraph() {
		waithelper.WaitForElement(clickGraph,20);
		clickGraph.click();
	}
	
	public void selectGraph() {
		waithelper.WaitForElement(selectGraph,20);
		selectGraph.click();
	}
	public void clickPublish() {
		waithelper.WaitForElement(clickPublish,20);
		clickPublish.click();
	}
}
