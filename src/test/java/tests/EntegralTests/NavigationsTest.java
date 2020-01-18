package tests.EntegralTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.TestBase;
import utils.BrowserUtils;
import utils.Driver;

import java.util.Scanner;

public class NavigationsTest extends TestBase {
    @Test(description = "Navigate to the Entegral Suite page and Verify that sub title is 'Entegral Suite'")
    public void test1() {
        extentTest = extentReports.createTest("Navigate to the Entegral Suite page and Verify that sub title is 'Smart Locator");
        BasePage basePage = new BasePage();
        basePage.navigateTo("Solutions", "Smart Locator");
        String expectedSubTitle = "Smart Locator";
        String actualSubTitle = basePage.getPageSubTitle();
        Assert.assertEquals(expectedSubTitle, actualSubTitle, "SubTitle was Wrong !");
        BrowserUtils.wait(2);
        extentTest.pass("Navigate to the Entegral Suite page and Verify that sub title is 'Smart Locator'");
    }

    @Test(description = "Navigate to ")
    public void test2() {
        BasePage basePage = new BasePage();
        basePage.navigateTo("Company", "Support");
        BrowserUtils.wait(2);
    }

    @Test(description = "Navigate to ")
    public void test3() {
        BasePage basePage = new BasePage();
        basePage.navigateTo("Company", "Careers");
        BrowserUtils.wait(2);
    }
}

