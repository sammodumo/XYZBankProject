package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LogInFunctionality {

    WebDriver driver;

    public LogInFunctionality(WebDriver webDrivers){

        driver = webDrivers;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[1]/button")
    private WebElement logInBtn;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[3]")
    private WebElement customerName;

    public void clickLogInBtn(){
        logInBtn.click();
    }

    public void clickDropName(){
        customerName.click();
    }
}
