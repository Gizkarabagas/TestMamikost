package Repository;
import org.openqa.selenium.By;


public class Addkost {
    //Data kost
    public By tambahProperty = By.xpath("//p[contains(.,'Tambah Properti')]");
    public By tipekos = By.xpath("(//button[@type='button'])[1]");
    public By buatkosButton = By.xpath("//button[@class='bg-c-button choose-property-type__create-button bg-c-button--primary bg-c-button--md bg-c-button--block']");
    public By namakos = By.xpath("//input[@class='bg-c-input__field']");
    public By checkboxtipe1 = By.xpath("//label[@class='step-one__input-label step-one__input-label--has-checkbox']//span[@class='bg-c-checkbox__icon']");
    public By gambarputri = By.xpath("//img[@alt='type-kost-girl']");
    public By tipeKamar = By.xpath("(//input[@class='bg-c-input__field'])[2]");
    public By deskripsikos = By.xpath("//div[@class='content']//div[@class='bg-c-field']//textarea[@class='bg-c-textarea__field bg-c-textarea__field--lg']");
    public By peraturanButton = By.xpath("(//button[@type='button'])[1]");
    public By min5orang = By.xpath("(//input[@type='checkbox'])[2]");
    public By uploadPraturan = By.xpath("//button[@class='button is-primary is-outlined is-fullwidth']");
    public By tahunKostbangun = By.xpath("//span[@class='bg-c-select__trigger-text bg-c-select__trigger-text--placeholder']");
    public By duaribudua = By.xpath("//a[contains(.,'2022')]");
    public By buttonlanjutkan = By.xpath("//button[@class='bg-c-button bg-c-button--primary bg-c-button--lg']");
    public By tahun2022 = By.xpath("(//a[@class='bg-c-dropdown__menu-item bg-u-radius--md'])[1]");
    public By catatanlain = By.xpath("(//textarea[@class='bg-c-textarea__field bg-c-textarea__field--lg'])[2]");
    public By tambahkos = By.xpath("//span[contains(text(),'Tambah Kos Baru')]");

    //alamatkost

    public By searchalamat = By.xpath("//input[@class='input target-autocomplete']");
    public By Kuningan = By.xpath("(//span[@class='pac-item-query target-autocomplete'])[2]");
    public By addkabupaten = By.xpath("(//div[@class='bg-c-dropdown__trigger'])[2]");
    public By Kabkuningan = By.xpath("(//div[@class='bg-c-dropdown__menu-item-content'])[45]");
    public By mandirancan = By.xpath("(//a[@class='bg-c-dropdown__menu-item bg-u-radius--md'])[85]");
    public By catatanAlamat = By.xpath("(//textarea[@class='bg-c-textarea__field bg-c-textarea__field--lg'])[2]");
    public By addkecamatan = By.xpath("(//div[@class='bg-c-dropdown__trigger'])[3]");
    public By buttonlanjutkanalamat = By.xpath("//button[@class='bg-c-button bg-c-button--primary bg-c-button--lg']");
}
