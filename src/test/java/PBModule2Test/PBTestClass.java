package PBModule2Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.PBBaseClass;
import PBModule2.PB_TermLifeInsurance;

public class PBTestClass extends PBBaseClass 
{
PB_TermLifeInsurance P1;

@BeforeClass	
public void OpenBrowser()
{
	InitializeBrowser();
	
	P1= new PB_TermLifeInsurance(driver);
}

@Test
public void TLInsurance()
{
P1.ClickPB_TermLifeInsuranceTLI();	
}


}
