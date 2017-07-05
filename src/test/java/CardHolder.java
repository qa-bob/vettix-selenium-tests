import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardHolder {
    public static void cardHolder(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/list.html?_n1cardholder=");
        list(driver);
        search(driver);
        cardHolderAdd(driver);
    }

    private static void list(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/cardholder/issuer_list.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }

    private static void search(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/cardholder/search.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form")).isDisplayed();
    }

    private static void cardHolderAdd(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/cardholder/cardholder_add.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }
}
