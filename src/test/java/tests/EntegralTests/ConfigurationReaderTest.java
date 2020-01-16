package tests.EntegralTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigurationReader;

public class ConfigurationReaderTest {

    @Test(description = "Verify that browser from properties file is equals to 'chrome'")
    public void test1() {
        String expectedBrowser = "chrome";
        String actualBrowser = ConfigurationReader.getProperty("browser");
        Assert.assertEquals(actualBrowser, expectedBrowser);
    }

    @Test(description = "Read the URL from properties file ")
    public void test2() {
        System.out.println(ConfigurationReader.getProperty("url"));
        System.out.println("UserName : " + ConfigurationReader.getProperty("userName"));
        System.out.println("PassWord : " + ConfigurationReader.getProperty("passWord"));
    }
}
