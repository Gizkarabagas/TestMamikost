package dll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class GetDriverManager {
    //Driver Manager method
    protected static WebDriver driver;
    public WebDriver getdriver() {
        SessionId sessionId = null;
        if (driver != null){
            sessionId = ((RemoteWebDriver) driver).getSessionId();
        }
        if (driver == null){
            System.out.println("start a new browser");
            System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (sessionId == null) {
            System.out.println("start a new browser again");
            System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

   public void sendAttachment(String theFile) throws Exception {
        Robot rb = new Robot();
        StringSelection strSel = new StringSelection(theFile);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null); //save/copy the file

        rb.delay(1000);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }


}
