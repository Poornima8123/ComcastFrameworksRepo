package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * TEST CLASS FOR CONTACT MODULE
 * @author Poornima B Hiremath
 * CTRL+SHIFT+B
 */

public class CreateOrgTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\commondata.properties");

        Properties pObj = new Properties();
        pObj.load(fis);

        String BROWSER = pObj.getProperty("browser");
        String URL = pObj.getProperty("url");
        String USERNAME = pObj.getProperty("username");
        String PASSWORD = pObj.getProperty("password");

        WebDriver driver = null;

        if (BROWSER.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else {
            driver = new EdgeDriver();
        }

        Thread.sleep(1000);
        driver.get(URL);
        Thread.sleep(5000);

        driver.findElement(By.id("email")).sendKeys(USERNAME);
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[text()='Sign In'])[2]")).click();

        Thread.sleep(4000);
        driver.quit();
    }
}