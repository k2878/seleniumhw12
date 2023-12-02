package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    public static WebDriver driver;
     String Url = "https://demo.nopcommerce.com/";
    public void setup(String url){

        driver = new FirefoxDriver();

           driver.get(url);
        driver.manage().window().maximize();

    }
    public void closeBrowser(){driver.quit();}

}
