package StepDef;

import dll.GetDriverManager;
import dll.TestData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Repository.Login;

import java.time.Duration;

public class hook extends GetDriverManager {
    GetDriverManager gdm = new GetDriverManager();
    @Before
    public void initializing() {
        System.out.println("Test starts");
        Login login = new Login();
        TestData testData = new TestData();
        gdm.getdriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();

}
    @After
    public void ending() throws Exception{
//        driver.quit();
    }
}

