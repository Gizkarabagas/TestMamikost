package Repository;

import org.openqa.selenium.By;

public class Harga {
    public By hargaperbulan = By.xpath("(//input[@class='input step-seven__input'])[1]");
    public By durasisewa = By.xpath("(//span[@class='bg-c-checkbox__icon'])[1]");
    public By buttonlanjutkandaftar = By.xpath("//button[@class='button direct-booking__button-next is-primary is-fullwidth']");
    public By lewati = By.xpath("//button[@class='bg-c-button personal-data__footer-bbk-basic-button bg-c-button--tertiary bg-c-button--lg bg-c-button--block']");
    public By lewatilengkapidata = By.xpath("//button[@class='bg-c-button bbk-faq__footer-button bg-c-button--tertiary bg-c-button--lg bg-c-button--block']");
    public By selesai = By.xpath("//button[contains(text(),'Selesai')]");
    public By nantisaja = By.xpath("//button[@class='bg-c-button bg-c-button--tertiary bg-c-button--lg']");
    public By verifykost = By.xpath("(//div[@class='text'])[1]");

}
