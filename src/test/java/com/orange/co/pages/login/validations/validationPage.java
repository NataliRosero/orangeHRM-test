package com.orange.co.pages.login.validations;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validationPage extends PageObject {

    @FindBy(xpath= "//h6[text()='Dashboard']")
    protected WebElement dashboardTitle;

    @FindBy(xpath= "//p[text()='Invalid credentials']")
    protected WebElement invalidPassword;

    @Step("validar que ingrese a la pagina inicial")
    public Boolean isDashboardVisible(){
        return dashboardTitle.isDisplayed();
    }

    @Step("muestra mensaje de credenciales invalidas")
    public Boolean errorLoginIsDisplayed(){
        return invalidPassword.isDisplayed();
    }


}
