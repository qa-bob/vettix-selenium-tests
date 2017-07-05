import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Users {
    public static void users(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/?_n1usr=");
        listusers(driver);
        editusers(driver);
        newuser(driver);
    }

    private static void listusers(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/list.html");
        Assert.assertTrue(driver.findElement(By.tagName("table")).isDisplayed());
//        driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[45]/td[1]/a")).click();
//        Assert.assertTrue(driver.findElement(By.name("_name")).getText().contains("Bob Small"));
    }

    private static void editusers(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/edit.html");
        Assert.assertTrue(driver.findElement(By.name("mainForm")).isDisplayed());
    }

    private static void newuser(WebDriver driver) {
        NavToURL.navToURL(driver, "https://test.campuscardcenter.com/dvh/user/new.html");
        Assert.assertTrue(driver.findElement(By.name("iss_list")).isDisplayed());
        Random rand = new Random();
        int  randomNumber = rand.nextInt(50000) + 1;
        //TODO:create random string
        driver.findElement(By.name("_username")).sendKeys("AutoTest"+ randomNumber);
        driver.findElement(By.name("_name")).sendKeys("AutoTest "+ randomNumber);
        driver.findElement(By.name("_email")).sendKeys("AutoTest "+ randomNumber +"@blackboard.com");
        driver.findElement(By.name("_password")).sendKeys("password1234");
        driver.findElement(By.name("_conf_password")).sendKeys("password1234");
        driver.findElement(By.name("_perm_Login")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/center/table/tbody/tr/td/table" +
                "/tbody/tr[1]/td/form/table/tbody/tr[5]/td/table/tbody/tr/td/select/option[1]")).click();
        driver.findElement(By.name("_action")).click();
        //TODO:Create user, update user, remove/disable user
        //TODO:create user with each permission
        //TODO:create user with no permissions
        //TODO:create user for each issuer
        //TODO:create user for 2 or more issuers
        //TODO:update user permissions
        //TODO:update user + issuer
        //TODO:update user - issuer
        //TODO:update user properties
        //TODO:update user history
    }

}
