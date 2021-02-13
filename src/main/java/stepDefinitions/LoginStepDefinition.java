package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {
    WebDriver driver;


    @Given("^user is already on Login Page$")
    public void user_already_on_login_page() {
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "/Users/hardeepkainth/Downloads/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/");
//        browser.manage().timeouts().implicitlyWait(UtilitiesTest.ImplicitWait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//	 }
    }

    public void waitInSeconds(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_Free_CRM() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Cogmento CRM");
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        waitInSeconds(5);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kainthhardeep276@gmail.com");
        waitInSeconds(3);
        driver.findElement(By.name("password")).sendKeys("Automation1234");
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() {
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@type = submit']"));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("argument[0].clicks();", loginBtn);
//        throw new PendingException();
        String title = driver.getTitle();
        System.out.println("Home Page title : " + title);
        Assert.assertEquals("Cogmento CRM", title);
    } 

    @Then("^user moves to new contact page$")
    public void user_moves_to_new_contact_page() {
        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),Contacts')]"))).build().perform();
        actions.moveToElement(driver.findElement(By.cssSelector("a[href='/contacts']"))).build().perform();
        //("a[href='/contacts']"
        driver.findElement(By.cssSelector("#main-nav > div:nth-child(3) > button")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
    }

    @Then("^user enters contactDetails \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_contactDetails_and_and(String firstName, String lastName, String company) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys(firstName);
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys(lastName);
        driver.findElement(By.cssSelector("div[class='ui active visible fluid search selection dropdown'] > input")).sendKeys(company);
        driver.findElement(By.cssSelector("button[class='ui linkedin button']")).click();
    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}
// Write code here that turns the phrase above into concrete actions
