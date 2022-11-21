package com.example.demo.tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.demo.core.CoreFunction;
import com.example.demo.pages.MainPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

public class MainPageTest {
    MainPage mainPage = MainPage.getInstance();
    CoreFunction coreFunction = CoreFunction.getInstance();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        coreFunction.login();
    }

    @Test
    public void goToSetting() {
        mainPage.getSetting().click();
    }

    @Test
    public void testUserMenu() {
        mainPage.getUserItem().click();
    }
}
