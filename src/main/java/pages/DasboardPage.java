package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DasboardPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"agenda_view\"]/div/div/h2/a")
    public WebElement txtValidation;

    public DasboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
