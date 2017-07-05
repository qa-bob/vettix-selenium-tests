
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetAttributes {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("log", "{level: error}");
        WebDriver driver = new FirefoxDriver(capabilities);
        String url = "https://test.campuscardcenter.com/dvh/login.html";
        System.out.println("The Environment is "+ Reflection.getCurrentEnv());
        NavToURL.navToURL(driver, url);
        NavToURL.login(driver);
        Users.users(driver);
        Transactions.transactions(driver);
        CardHolder.cardHolder(driver);
        IssuerManagement.issuer(driver);
        Plans.plans(driver);
        Merchants.merch(driver);
        url = "https://test.campuscardcenter.com/dvh/logout.html";
        NavToURL.navToURL(driver, url);
    driver.quit();
    }
}
