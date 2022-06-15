package com.framework.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPage extends BasePage {


//    @Autowired
//    private LoginPage loginPage;


    @Autowired
    private WebDriver webDriver;


//    @Value("${app.url}")
//    private String appUrl;

    public void performLogin() {

        // webDriver.navigate().to(appUrl);
        //  System.out.println("Login" + appUrl);
        webDriver.navigate().to("http://eaapp.somee.com");
    }
}
