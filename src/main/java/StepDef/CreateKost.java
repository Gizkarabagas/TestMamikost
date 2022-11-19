package StepDef;

import Repository.Addkost;
import Repository.Fotokost;
import Repository.LoginOwner;
import dll.GetDriverManager;
import dll.TestData;
import Repository.ketersediaanKamar;
import Repository.fasilitas;
import Repository.Harga;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateKost extends GetDriverManager {
    WebDriver driver = getdriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    LoginOwner loginOwner = new LoginOwner();
    TestData testData = new TestData();
    Addkost addkost = new Addkost();
    Fotokost fotokost = new Fotokost();
    fasilitas fasilitas = new fasilitas();
    ketersediaanKamar ketkamar = new ketersediaanKamar();
    Harga harga = new Harga();



    @When("user input owner account and password")
    public void userInputOwnerAccountAndPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginOwner.buttonmasuk)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginOwner.pemilikos)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginOwner.NoHP)).sendKeys(testData.NohpOwner);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginOwner.password)).sendKeys(testData.passwordowner);

    }

    @Then("user successfully login as owner")
    public void userSuccessfullyLoginAsOwner() {
        driver.findElement(loginOwner.login).click();
    }

    @Given("user create kos")
    public void userCreateKos() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.tambahProperty)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.buatkosButton)).click();

    }

    @When("user fill Data kos")
    public void userFillDataKos() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(addkost.tambahkos)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.namakos)).sendKeys(testData.addnamakost);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.checkboxtipe1)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.tipeKamar)).sendKeys("Tipe A");
        WebElement kostan = driver.findElement(addkost.gambarputri);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", kostan);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.deskripsikos)).sendKeys("bagus");
        WebElement aturankost = driver.findElement(addkost.peraturanButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", aturankost);
        Thread.sleep(3000);

        WebElement min5orang = driver.findElement(addkost.min5orang);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", min5orang);

        WebElement tahunkost = driver.findElement(addkost.tahunKostbangun);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tahunkost);

        Actions a= new Actions(driver);
        WebElement tahun2022=driver.findElement(addkost.tahun2022);
        a.moveToElement(tahun2022).build().perform();
        WebElement Sub = driver.findElement(addkost.tahun2022);
        Sub.click();

        WebElement element = driver.findElement(addkost.catatanlain);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

        WebElement catatan = driver.findElement(addkost.catatanlain);
        catatan.sendKeys("gaskeunmurah");
        catatan.sendKeys(Keys.CONTROL);
        catatan.sendKeys("gaskeunmurah");

        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.buttonlanjutkan)).click();


    }

    @And("User fill alamat kos")
    public void userFillAlamatKos() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.searchalamat)).sendKeys("kuningan");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.Kuningan)).click();

        WebElement element = driver.findElement(addkost.addkabupaten);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(addkost.addkabupaten)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addkost.Kabkuningan)).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(addkost.addkecamatan)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addkost.mandirancan)).click();

        WebElement catatan = driver.findElement(addkost.catatanAlamat);
        catatan.sendKeys("gampangdi temukan mudah dan ezzy sekali dan semoga saja lulus test mamikost walau masi sampah kodinganya");
        catatan.sendKeys(Keys.CONTROL);
        catatan.sendKeys("gampangdi temukan mudah dan ezzy sekali dan semoga saja lulus test mamikost walau masi sampah kodinganya");

        wait.until(ExpectedConditions.visibilityOfElementLocated(addkost.buttonlanjutkanalamat)).click();
    }

    @And("user fill foto kos")
    public void userFillFotoKos() throws Exception {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.closepopup)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(fotokost.fotodepan)).click();
        sendAttachment(testData.foto1);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.fotodalambangunan)).click();
        sendAttachment(testData.foto1);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(fotokost.fotodarijalan)).click();
        sendAttachment(testData.foto1);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.buttonLanjut)).click();
    }

    @And("user fill foto kamar")
    public void userFillFotoKamar() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.fotodepankamar)).click();
        sendAttachment(testData.foto1);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.fotodalamkamar)).click();
        sendAttachment(testData.foto1);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.fotokamarmandi)).click();
        Thread.sleep(3000);
        sendAttachment(testData.foto1);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.buttonLanjut)).click();


    }

    @And("user fill fasilitas")
    public void userFillFasilitas()throws Exception {
        Thread.sleep(4000);

        WebElement airjernih= driver.findElement(fasilitas.airjernih);
        airjernih.click();

        WebElement gulingg = driver.findElement(fasilitas.guling);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", gulingg);


        WebElement bathupp = driver.findElement(fasilitas.bathup);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bathupp);


        wait.until(ExpectedConditions.elementToBeClickable(fotokost.buttonLanjut)).click();


    }

    @And("user fill ketersediaan kamar")
    public void userFillKetersediaanKamar() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(ketkamar.ukuranKamar3x4)).click();

        WebElement jumlahkamar = driver.findElement(ketkamar.totalkamar);
        jumlahkamar.clear();
        jumlahkamar.sendKeys("15");

        Thread.sleep(3000);

        WebElement totalkamar = driver.findElement(ketkamar.kamartersedia);
        jumlahkamar.clear();
        Thread.sleep(3000);
        totalkamar.sendKeys("10");

        wait.until(ExpectedConditions.elementToBeClickable(fotokost.buttonLanjut)).click();





    }

    @Then("user fill harga")
    public void userFillHarga() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(harga.hargaperbulan).click();
        WebElement Harga = driver.findElement(harga.hargaperbulan);
        Harga.sendKeys(String.valueOf(5000000));

        wait.until(ExpectedConditions.elementToBeClickable(harga.durasisewa)).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(fotokost.buttonLanjut)).click();

        Thread.sleep(3000);
        WebElement selesai = driver.findElement(harga.selesai);
        selesai.click();

        Thread.sleep(3000);
        WebElement nantisaja = driver.findElement(harga.nantisaja);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nantisaja);

        String verify = driver.findElement(harga.verifykost).getText();
        String [] verifynamakost = verify.split(" ");
        Assert.assertEquals(testData.addnamakost,verifynamakost[0]);


    }
}
