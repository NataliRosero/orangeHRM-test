package com.orange.co.steps.login;

import com.orange.co.pages.login.LoginPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar password")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin (){
       btn_login.click();
    }

    @Step("Cerrar sesion")
    public void closedSesionUser(){
        userLogin.click();
        btn_logout.click();
    }

}
