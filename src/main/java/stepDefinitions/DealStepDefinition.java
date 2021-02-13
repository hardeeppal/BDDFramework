//package stepDefinitions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class DealStepDefinition {
//    WebDriver driver;
//
//
//    @Given("^user is already on Login Page$")
//    public void user_already_on_login_page() {
//        WebDriverManager.chromedriver().setup();
////        System.setProperty("webdriver.chrome.driver", "/Users/hardeepkainth/Downloads/chromedriver 2");
//        driver = new ChromeDriver();
//        driver.get("https://ui.freecrm.com/");
////        browser.manage().timeouts().implicitlyWait(UtilitiesTest.ImplicitWait, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
////	 }
//    }
//
//    public void waitInSeconds(int seconds) {
//        try {
//            Thread.sleep(1000 * seconds);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @When("^title of login page is Free CRM$")
//    public void title_of_login_page_is_Free_CRM() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals(title, "Cogmento CRM");
//    }
//
//    @Then("user enters username and password$")
//    public void user_enter_username_and_password(DataTable credentials) {
//        // Write code here that turns the phrase above into concrete actions
//        waitInSeconds(5);
//        List<List<String>> data = credentials.raw(); // Raw method will give me list of string
////        data.get(0); // We are using 0 because we have only one row
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(data.get(0).get(0));
//        waitInSeconds(3);
//        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//    }
//
//    @Then("^user clicks on login button$")
//    public void user_clicks_on_login_button() {
//        driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
//    }
//
//
//    @Then("^user is on home page$")
//    public void user_is_on_home_page() {
////        WebElement loginBtn = driver.findElement(By.xpath("//input[@type = submit']"));
////        JavascriptExecutor jse = (JavascriptExecutor) driver;
////        jse.executeScript("argument[0].clicks();", loginBtn);
////        throw new PendingException();
//        String title = driver.getTitle();
//        System.out.println("Home Page title : " + title);
//        Assert.assertEquals("Cogmento CRM", title);
//    }
//
//    @Then("^user moves to new deal page$")
//    public void user_moves_to_new_contact_page() {
//        Actions actions = new Actions(driver);
////        actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),Contacts')]"))).build().perform();
//        actions.moveToElement(driver.findElement(By.cssSelector("i[class='money icon'] +span[class='item-text']"))).build().perform();
//        //("a[href='/contacts']"
//        driver.findElement(By.cssSelector("#main-nav > div:nth-child(5) > button")).click();
////        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//    }
//
//    @Then("^user enters deal details$")
//    public void user_enters_contactDetails_and_and(DataTable dealData) {
//        List<List<String>> deals = dealData.raw();
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.cssSelector("input[name='title']")).sendKeys(deals.get(0).get(0));
//        driver.findElement(By.cssSelector("input[name='amount']")).sendKeys(deals.get(0).get(1));
//        driver.findElement(By.cssSelector("input[name='probability']")).sendKeys(deals.get(0).get(2));
//        driver.findElement(By.cssSelector("input[name='commission']")).sendKeys(deals.get(0).get(3));
//        driver.findElement(By.cssSelector("button[class='ui linkedin button']")).click();
//    }
//
//    @Then("^Close the browser:$")
//    public void close_the_browser() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.quit();
//    }
//}
