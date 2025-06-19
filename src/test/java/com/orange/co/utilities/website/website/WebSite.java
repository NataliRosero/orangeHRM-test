package com.orange.co.utilities.website.website;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject orange;


    @Step ("navegar a sitio web")
    public void navigateTo(String url){
        orange.setDefaultBaseUrl(url);
        orange.open();
    }
}
