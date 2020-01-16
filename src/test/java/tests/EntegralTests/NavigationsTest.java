package tests.EntegralTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.TestBase;
import utils.BrowserUtils;
import utils.Driver;

public class NavigationsTest extends TestBase {
    @Test(description = "Navigate to the Entegral Suite page and Verify that sub title is 'Entegral Suite'")
    public void test1(){
        BasePage basePage = new BasePage();
        basePage.navigateTo("Solutions","Smart Locator");
        String expectedSubTitle = "Smart Locator";
        String actualSubTitle = basePage.getPageSubTitle();
        Assert.assertEquals(expectedSubTitle,actualSubTitle,"SubTitle was Wrong !");
    }

    @Test(description = "Navigate to ")
    public void test2(){
        BasePage basePage = new BasePage();
        basePage.navigateTo("Company","Support");
    }

    @Test(description = "Navigate to ")
    public void test3(){
        BasePage basePage = new BasePage();
        basePage.navigateTo("Company","Careers");
    }
}
