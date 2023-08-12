import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.Collections;
import java.util.List;


public class ProductPage {

    private final WebDriver driver;
    private final By firstSelection = (By.xpath("(//span[@class='label ng-star-inserted'][normalize-space()='Bee Beauty'])[1]"));
    private final By secondSelection = (By.xpath("(//a[@class='value facet-value-link facet-value-link-for-multi-select ng-star-inserted'])[2]"));
    private final By clearFiltersVerify = (By.xpath("//a[normalize-space()='Filtreleri Temizle']"));
    private final By productSelection = (By.xpath("//div[@aria-label='1 / 15']//app-custom-media[@class='cx-product-image is-initialized']"));
    private final By addToBasket = (By.xpath(".add-to-basket.round-btns.fat"));
    private final By loginCheckBox = (By.xpath("//div[@class='log-actions']"));
    private final By login = (By.xpath("//div[@class='log-actions']//li[1]"));
    private final By userName = (By.xpath("ng-invalid ng-dirty ng-touched bvalidator-gray-invalid"));
    private final By password = (By.xpath("ng-pristine ng-invalid bvalidator-gray-invalid ng-touched"));


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkBoxSelection() {
        WebElement first = driver.findElement(firstSelection);
        first.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement second = driver.findElement(secondSelection);
        second.click();
    }

    public void buttonVerify() {
        List<WebElement> elements = Collections.singletonList(driver.findElement((clearFiltersVerify)));
        System.out.println(("Verify Succesfull"));
    }

    public void addProduct() {
        WebElement product = driver.findElement(productSelection);
        product.click();
    }

    public void setAddToBasket() {
        WebElement basket = driver.findElement(addToBasket);
        basket.click();
    }

    public void Logincheckbox() {
        WebElement Login = driver.findElement(loginCheckBox);
        Login.click();
    }

    public void Login() {
        WebElement loginset = driver.findElement(login);
        loginset.click();
    }

    public void userinfo() {
        WebElement userinfoset = driver.findElement(userName);
        userinfoset.click();
        userinfoset.sendKeys("Bee Beauty Havyarlı Siyah Kil Maskesi 75 ml");
    }

    public void passwordinfo() {
        WebElement passwordset = driver.findElement(password);
        passwordset.click();
        passwordset.sendKeys("54,00TL");
    }

}
