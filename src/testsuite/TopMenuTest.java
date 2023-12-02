package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){setup(baseUrl);}



    @Test
    public void navigateToComputerPage() {

        WebElement computersTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
        computersTab.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).getText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void NavigateToElectronicsPage() {

        WebElement electronicsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        electronicsTab.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).getText();
        String expectedText = "Electronics";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void navigateToApparelPageSuccessfully(){
    WebElement apparelsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        apparelsTab.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Apprels')]")).getText();
        String expectedText = "Apprels";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void NavigateToDigitalDownloadsPageSuccessfully(){
        WebElement digitalDownloads = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]"));
        digitalDownloads.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).getText();
        String expectedText = "Digital downloads";
        Assert.assertEquals(actualText,expectedText);


    }

    @Test
    public void NavigateToBooksPageSuccessfully(){
        WebElement booksTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]"));
        booksTab.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Books')]")).getText();
        String expectedText = "Books";
        Assert.assertEquals(actualText,expectedText);



    }


    @Test
    public void NavigateToJewelryPageSuccessfully(){
       WebElement jewelryTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]"));
        jewelryTab.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).getText();
        String expectedText = "Jewelry";
        Assert.assertEquals(actualText,expectedText);


    }

    @Test
    public void NavigateToGiftCardsPageSuccessfully(){
       WebElement giftCardsTab =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]"));
        giftCardsTab.click();
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals(actualText,expectedText);


    }
    @After
    public void endTest(){ closeBrowser();}
}