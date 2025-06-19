package com.orange.co.definitions;

import com.orange.co.pages.login.validations.validationPage;
import com.orange.co.steps.login.LoginSteps;
import com.orange.co.utilities.website.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginSteps login;

    @Steps(shared = true)
    validationPage validation;
    //String baseUrl = Serenity.sessionVariableCalled("webdriver.base.url").getValue();

    @Given("el usuario ingresa a la pagina web")
    public void openLoginPage(){
        url.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @When("ingresa usuario y contraseña validas")
    public void enterUsernamePasswordValidate() {
        login.typeUsername("Admin");
        login.typePassword("admin123");
        login.clickLogin();
    }


    @Then("la pagina debe ingresar a la pagina principal de la aplicación")
    public void validateShowDashboard(){
      Assert.assertTrue(validation.isDashboardVisible());
    }

    @And("el usuario debe cerrar sesion exitosamente")
    public void closedSesion(){
        login.closedSesionUser();
    }

    @When("ingresa usuario y contraseña invalidas")
    public void enterUsernamePasswordInvalidate() {
        login.typeUsername("Admin");
        login.typePassword("12345");
        login.clickLogin();
    }


    @Then("la pagina deberia mostrar un mensaje de error")
    public void showErrorLogin(){
        Assert.assertTrue(validation.errorLoginIsDisplayed());
    }


}
