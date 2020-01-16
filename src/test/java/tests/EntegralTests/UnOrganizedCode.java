package tests.EntegralTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnOrganizedCode {
    public static void main(String[] args) {
        WebDriver driver = getDriver("Chrome");
        driver.get("https://www.entegral.com/");
        String title = driver.getTitle();
        wait(2);
        System.out.println(title);
        driver.close();

    }

    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "A:\\ProjecTs\\Selenium_Dependencies\\Drivers\\chromedriver.exe");
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.firefox.driver",
                    "user.dir" + "/firefox");
            return new FirefoxDriver();
        }
        return null;
    }

    public static void wait(int Seconds) {
        try {
            Thread.sleep(1000 * Seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
