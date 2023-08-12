import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GratisHomePage {

    private final WebDriver driver;
    private final By skinCareSelection = (By.xpath("(//a[contains(text(),'Cilt Bakım')])[3]"));
    private final By randomSelections = (By.xpath("(//a[contains(text(),'Yüz Maskeleri')])[2]"));

    public GratisHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void skinCare() {
        Actions actions = new Actions(driver);
        WebElement skinCareBanner = driver.findElement(skinCareSelection);
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
        }
        actions.moveToElement(skinCareBanner).moveToElement(driver.findElement(skinCareSelection)).perform();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.gratis.com/";
        if (currentURL.equals(expectedURL)) {
            System.out.println("URL doğru. Geçerli URL: " + currentURL);
        } else {
            System.out.println("URL yanlış. Beklenen URL: " + expectedURL);
        }
    }

    public void randomSelectionOfSub_productsInSkincare() {
        WebElement randomSelection = driver.findElement(randomSelections);
        randomSelection.click();
        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
        }
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.gratis.com/cilt-bakim/yuz-maskeleri-c-5020202";

        if (currentURL.equals(expectedURL)) {
            System.out.println("URL doğru. Geçerli URL: " + currentURL);
        } else {
            System.out.println("URL yanlış. Beklenen URL: " + expectedURL);
        }
    }

}
