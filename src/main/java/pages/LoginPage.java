package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(linkText = "Iniciar sesión")
    private WebElement iniciarSesionLink;

    @FindBy(id = "email")
    private WebElement txtUserName;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"login_form\"]/button")
    private WebElement clickOnIniciarSesion;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div[3]/div[2]")
    private WebElement switchFrame;



    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickOnLink(){
        iniciarSesionLink.click();
    }

    public void typeUsername(String username){
        txtUserName.sendKeys(username);

    }

    public void typePassword(String password){
        txtPassword.sendKeys(password);
    }

    public void submitBtn(){
        clickOnIniciarSesion.click();
    }


public void frame(){
    driver.switchTo().frame(1);
}



}
