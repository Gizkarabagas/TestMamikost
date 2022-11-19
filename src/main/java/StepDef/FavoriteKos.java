package StepDef;

import Repository.Dashboard;
import Repository.Login;
import Repository.wishlist;
import dll.GetDriverManager;
import dll.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//import utilities.SeleniumHelpers;


public class FavoriteKos extends GetDriverManager {
    WebDriver driver = getdriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    Dashboard dashboard = new Dashboard();
    TestData testData = new TestData();
    wishlist wishlist = new wishlist();
    Login login = new Login();
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    Actions actions = new Actions(driver);
//    WebElement webElement = driver.findElement(kost10.popupNext);

    @Given("User in homepage")
    public void userInHomepage() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.Search)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboard.SearchTextBox)).sendKeys(testData.Tobelo);
        Thread.sleep(2000);
        driver.findElement(dashboard.Tobelo).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.kost10)).click();

    }

    @When("user login with phone number")
    public void userLoginWithPhoneNumber() {
    }

    @And("user want to favorite kos")
    public void userWantToFavoriteKos() throws InterruptedException {
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        WebElement element = driver.findElement(wishlist.ButtonSimpan);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);


        int i = 1;
        while (i < 6) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(wishlist.popupNext)).click();
            i++;
        }
        driver.findElement(wishlist.sayamengerti).click();
        WebElement elementtt = driver.findElement(wishlist.ButtonSimpan);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementtt);

    }



    @And("kos favorite")
    public void kosFavorite() {
        String titleKos = driver.getTitle();
        wait.until(ExpectedConditions.visibilityOfElementLocated(wishlist.favoritemenu)).click();
        String verifytitleKost = driver.findElement(wishlist.namakostan).getText();
        Assert.assertEquals(titleKos,verifytitleKost);

    }

    @Then("unfavorite Kos")
    public void unfavoriteKos() {
        driver.findElement(wishlist.namakostan).click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(2));
        WebElement kostan = driver.findElement(wishlist.ButtonSimpan);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", kostan);

        wait.until(ExpectedConditions.visibilityOfElementLocated(wishlist.favoritemenu)).click();
        Assert.assertTrue(driver.findElement(wishlist.belumfavorite).isDisplayed());



    }

    @Given("user navigate to homepage")
    public void userNavigateToHomepage() {
        driver.navigate().to("https://mamikos.com/");


    }

    @When("user input noHp and password")
    public void userInputNoHpAndPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(login.masuk)).click();
        wait.until(ExpectedConditions.elementToBeClickable(login.pencarikos)).click();
        wait.until(ExpectedConditions.elementToBeClickable(login.inputnoHP)).sendKeys(testData.noHP);
        wait.until(ExpectedConditions.elementToBeClickable(login.inputPassword)).sendKeys(testData.password);
    }

    @Then("User successfully login")
    public void userSuccessfullyLogin() {
        driver.findElement(login.Login).click();
    }
}
