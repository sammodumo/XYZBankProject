package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.LogInFunctionality;

public class LogInFunctionalityStep {

    @Given("I navigate to the login page")

    public void I_navigate_to_the_login_page() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);

    }

    @When("I enter valid credentials")

    public void I_enter_valid_credentials() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);

        LogInFunctionality logIn = new LogInFunctionality(driver);

        logIn.clickLogInBtn();
        Thread.sleep(2000);

        logIn.clickDropName();
        Thread.sleep(2000);

    }
}

