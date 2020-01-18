package tests.EntegralTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.TestBase;
import utils.BrowserUtils;

public class SmokeTest extends TestBase {

    @Test(dataProvider = "navigationInfo")
    public void smokeTest(String moduleName,String subModuleName, String subTitle ){
        extentTest = extentReports.createTest("Verify that Sub Title is equals to: "+subTitle);
        BasePage basePage = new BasePage();
        basePage.navigateTo(moduleName,subModuleName);
        Assert.assertEquals(basePage.getPageSubTitle(),subTitle);
        extentTest.pass("Verified that page sub title is equals to :"+subTitle);
        BrowserUtils.wait(2);
    }
    @DataProvider(name = "navigationInfo")
    public Object[][] navigationInfo(){
        return new Object[][]{
                //Module   SubModule  Titile
                {"Solutions","Entegral Suite","Entegral Suite"},
                {"Solutions","Network Management","Network Management"},
                {"Solutions","Smart Locator","Smart Locator"},

                {"Industries","Insurers","Insurers"},
                {"Industries","OEMs","OEMs"},
                {"Industries","Repair Facilities","Repair Facilities"},

                {"Company","About","About"},
                {"Company","Team","Team"},
                {"Company","Events","Events"},
                {"Company","Careers","Careers"},
                {"Company","Support","Support"}

        };
    }
}



