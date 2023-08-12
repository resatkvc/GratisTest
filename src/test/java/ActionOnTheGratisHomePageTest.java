import org.junit.jupiter.api.Test;

public class ActionOnTheGratisHomePageTest extends BaseTest {
    GratisHomePage homePage;

    public ActionOnTheGratisHomePageTest() {
        super();
        homePage = new GratisHomePage(driver);
    }

    @Test
    public void goGratisHomePage() {
        homePage.skinCare();
    }

    @Test
    public void mauseHoverSkinCare() {
        homePage.randomSelectionOfSub_productsInSkincare();
    }
}