package com.framework.selenium;

import com.framework.selenium.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumApplicationTests {

    @Autowired
    private MainPage mainPage;

    @Test
    void contextLoads() {

        mainPage.performLogin();
    }

}
