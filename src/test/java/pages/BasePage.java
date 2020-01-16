package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;
import utils.Driver;

public class BasePage {
    @FindBy(xpath = "(//span[@itemprop=\"name\"])[2]")
    public WebElement pageSubtitle;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateTo(String moduleName, String subModuleName) {
        //// syntax for : module a[text()='Industries' and contains(@class,'mega-nav-hover-tunnel')]
        String moduleLocator = "//a[text()='"+moduleName+"' and contains(@class,'mega-nav-hover-tunnel')]";
        String subModuleLocator = "(//a[@data-icid='nav-_-"+subModuleName+"-_-home'])[1]";
        //                         (//a[@data-icid='nav-_-Smart Locator-_-home'])[1]
        WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        wait.until(ExpectedConditions.visibilityOf(module));

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(module).build().perform();

        WebElement subModule = Driver.get().findElement(By.xpath(subModuleLocator));
        BrowserUtils.waitForStaleElement(subModule);
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(subModule));
        wait.until(ExpectedConditions.elementToBeClickable(subModule));
        subModule.click();
    }

    public String getPageSubTitle() {
        BrowserUtils.waitForStaleElement(pageSubtitle);
        return pageSubtitle.getText();
    }

}


//    data-icid="nav-_-Entegral Suite-_-entegral-suite"

//    data-icid="nav-_-Network Management-_-entegral-suite"
//    data-icid="nav-_-Smart Locator-_-entegral-suite"


//           itemprop="name"
//           itemprop="name"


//[class="icon-angle-right"]




