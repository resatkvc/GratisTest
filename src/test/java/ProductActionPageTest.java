import org.junit.jupiter.api.Test;

public class ProductActionPageTest extends BaseTest {
    ProductPage productHome;

    public ProductActionPageTest() {
        super();
        productHome = new ProductPage(driver);
    }

    @Test
    public void checkBoxSelection() {
        productHome.checkBoxSelection();
    }

    @Test
    public void buttonVerifyControl() {
        productHome.buttonVerify();
    }

    @Test
    public void productSelection() {
        productHome.addProduct();
    }

    @Test
    public void setAddToBasket() {
        productHome.setAddToBasket();
    }

    @Test
    public void loginChech() {
        productHome.Logincheckbox();
    }

    @Test
    public void login() {
        productHome.Login();
    }

    @Test
    public void userinfo() {
        productHome.userinfo();
    }

    @Test
    public void passwordinfo() {
        productHome.passwordinfo();

    }

}

