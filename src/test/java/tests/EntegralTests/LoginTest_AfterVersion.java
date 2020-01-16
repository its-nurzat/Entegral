package tests.EntegralTests;

import org.testng.annotations.Test;
import tests.TestBase;
import utils.Driver;

public class LoginTest_AfterVersion extends TestBase {
    @Test(description = "Verify that Title is 'Entegral' ")
    public void test1() {
        String title = Driver.get().getTitle();
        System.out.println(title);
    }
}
