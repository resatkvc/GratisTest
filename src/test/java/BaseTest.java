import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(testlogger.TestResultLogger.class)


public class BaseTest {
    protected WebDriver driver;

    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gratis.com/");

        GratisHomePage gratisHomePage = new GratisHomePage(driver);
        gratisHomePage.skinCare();
        gratisHomePage.randomSelectionOfSub_productsInSkincare();

        ProductPage product = new ProductPage(driver);
        product.checkBoxSelection();
        product.buttonVerify();
        product.addProduct();
        product.setAddToBasket();
        product.Logincheckbox();
        product.Login();
        product.userinfo();
        product.passwordinfo();
    }


    @AfterAll
    public void tearDown() {
        driver.close();
    }

}