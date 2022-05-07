import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    private static WebDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://www.buyme.co.il/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

     public void test01_clickandfindElementBylink ()

         {driver.findElement(By.linkText("כניסה / הרשמה")).click();}




}
