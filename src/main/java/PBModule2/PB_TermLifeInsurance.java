package PBModule2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_TermLifeInsurance 
{
@FindBy(xpath="//i[@class=\"icon-bg homeIconsBg term-life\"]")private WebElement TermLifeInsurance;

@FindBy(xpath="//i[@class=\"icon-bg homeIconsBg health-insurance\"]")private WebElement HealthInsurance;

public PB_TermLifeInsurance(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void ClickPB_TermLifeInsuranceTLI()
{
	TermLifeInsurance.click();
}

public void ClickPB_TermLifeInsuranceHealthInsurance()
{
	HealthInsurance.click();
}

}
