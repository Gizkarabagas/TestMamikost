package Repository;
import org.openqa.selenium.By;


public class LoginOwner {
    public By pemilikos = By.xpath("//div[@class='login-role-selection login-modal__body']/div[contains(.,'Pemilik Kos')]");
    public By NoHP = By.xpath("//input[@name='Nomor Handphone']");
    public By password = By.xpath("//input[@name='Password']");
    public By login = By.xpath("//span[@class='track-login-owner']");
    public By buttonmasuk = By.xpath("//button[@class='nav-login-button']");
}
