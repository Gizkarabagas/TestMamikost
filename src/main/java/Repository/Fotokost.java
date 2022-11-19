package Repository;

import org.openqa.selenium.By;


public class Fotokost {
    public By buttonLanjut = By.xpath("//button[@class='bg-c-button bg-c-button--primary bg-c-button--lg']");
    public By fotodepan = By.xpath("(//div[@class='image-uploader__empty-state empty-state'])[1]");
    public By fotodalambangunan = By.xpath("(//div[@class='image-uploader__empty-state empty-state'])[2]");
    public By fotodarijalan =By.xpath("//div[@class='image-uploader__empty-state empty-state']");
    public By closepopup = By.xpath("//button[@class='bg-c-modal__action-closable']");

    //foto kamar
    public By fotodepankamar = By.xpath("(//div[@class='image-uploader'])[1]");
    public By fotodalamkamar = By.xpath("(//div[@class='image-uploader'])[2]");
    public By fotokamarmandi = By.xpath("(//div[@class='image-uploader'])[3]");

}

