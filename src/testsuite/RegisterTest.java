package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){setup(baseUrl);}

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedText = "Register";
        Assert.assertEquals(expectedText,actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
         WebElement registerButton = driver.findElement(By.xpath("//div[@class='header-links-wrapper']/div/ul/li[1]"));
        registerButton.click();

        WebElement genderRadioButton = driver.findElement(By.xpath("//div[@id='gender']"));
        genderRadioButton.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.click();

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.click();
        
        WebElement dateOfBirth =driver.findElement(By.xpath("//div[@class='inputs date-of-birth']"));
        dateOfBirth.click();

        WebElement Email = driver.findElement(By.id("Email"));
        Email.click();

        WebElement password = driver.findElement(By.id("Password"));
        password.click();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.click();

        WebElement RegisterButton = driver.findElement(By.id("register-button"));
        RegisterButton.click();

        String actualText = driver.findElement(By.xpath("//div[@class='buttons']")).getText();
        String expectedText = "REGISTER";
        Assert.assertEquals(actualText,expectedText);




    }
   @After
    public void endTest(){
        closeBrowser();
    }


}
