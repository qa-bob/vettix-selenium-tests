import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuerManagement {
    public static void issuer(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/list.html?_n1issuer=");
        list(driver);
    }

    private static void list(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/issuer/issuer_list.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }
}
