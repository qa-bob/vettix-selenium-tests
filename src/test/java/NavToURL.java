import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavToURL {
    public static void navToURL(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void login(WebDriver driver) {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("bsmall");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456asd!");
        WebElement login = driver.findElement(By.name("action"));
        login.click();
    }
}
