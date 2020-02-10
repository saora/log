package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DasboardPage;
import pages.LoginPage;

public class Login {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saoramx\\IdeaProjects\\LoginTest\\src\\main\\resources\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://todoist.com/\n");

    }

    @Test
    public void loginTest(){
        LoginPage login = new LoginPage(driver);
        login.clickOnLink();

        driver.switchTo().frame(1);
        login.typeUsername("Felix.sanchez@wizeline.com");
        login.typePassword("Test@123");
        login.submitBtn();

        DasboardPage dp = new DasboardPage(driver);
        Assert.assertTrue(dp.txtValidation.getText().contains("Today"));

    }


}
