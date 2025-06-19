package com.orange.co.pages.login;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject{

    @FindBy(name = "username")
    protected WebElement txt_username;

    @FindBy(name = "password")
    protected WebElement txt_password;

    @FindBy(css = "button[type='submit']")
    protected WebElement btn_login;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    protected WebElement userLogin;

    @FindBy(xpath = "//a[text()='Logout']")
    protected WebElement btn_logout;

}
