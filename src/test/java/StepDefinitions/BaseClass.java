package StepDefinitions;

import org.openqa.selenium.WebDriver;

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

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public PassingTemplate AT;
	public AddSection1_10Slider AS;
	public AddSection1_5slider AS1;
	public SingleSelection AS2;
	public MultipleSelection AS3;
	public Yes_No_Type AS4;
	public FreeText AS5;
	public UploadFile AS6;
	public Section8 AS7;
	public publishPassTemp PPT;
	public MaturityTemplate MT;
	public Maturity1_10Slider MS1;
	public Maturity1_5Slider MS2;
	public SingleSelectionMaturity MS3;
	public MultipleSelectionMaturity MS4;
	public Maturity_Yes_No MS5;
}
