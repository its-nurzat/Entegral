package tests.EntegralTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigurationReader;
import utils.Driver;

public class HomePageTest {

    @Test(description = "Open Entegral page, get the url from Configuration File and Verify Title")
    public void test1() {
        String url = ConfigurationReader.getProperty("url");
        Driver.get().get(url);
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.titleIs("Entegral"));

        String expectedPageTitle = "Entegral";
        String actualPageTitle = Driver.get().getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Page Title Was Wrong !");

        Driver.close();
    }
}
