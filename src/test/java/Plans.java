import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plans {
    public static void plans(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/list.html?_n1plan=");
        list(driver);
    }

    private static void list(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/plan/program_list.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }
}
