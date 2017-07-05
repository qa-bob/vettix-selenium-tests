import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Merchants {
    public static void merch(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/merchant/issuer_list.html?_n1merchants=");
        list(driver);
        search(driver);
    }

    private static void list(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/merchant/issuer_list.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }

    private static void search(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/merchant/search.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/table")).isDisplayed();
    }
}
