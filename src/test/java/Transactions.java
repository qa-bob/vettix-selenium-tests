import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transactions {
    public static void transactions(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/list.html?_n1txn=");
        last50(driver);
        listbyIssuer(driver);
        search(driver);
        debit(driver);
        credit(driver);
        transfer(driver);
        auditReport(driver);

    }

    private static void last50(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/txn/list.html?limit=50&iss_id_txn=all");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[3]/th[1]")).isDisplayed();
        //TODO: search for last 50 transactions

    }

    private static void listbyIssuer(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/txn/issuer_list.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }

    private static void search(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/txn/search.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/table")).isDisplayed();
        //TODO: search for existing
        //TODO: search for none existing
        //TODO: search for
    }

    private static void debit(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/txn/cardholder_search.html?d=y");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/table")).isDisplayed();
    }

    private static void credit(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/txn/cardholder_search.html?d=n");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/table")).isDisplayed();
    }

    private static void transfer(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/txn/cardholder_search.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/table")).isDisplayed();
    }

    private static void auditReport(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/reports/issuer_list.html");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table")).isDisplayed();
    }
}
