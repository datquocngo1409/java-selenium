package com.example.demo.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.demo.core.CoreFunction;
import com.example.demo.pages.MainPage;
import com.example.demo.pages.settings.SettingPage;
import com.example.demo.pages.settings.woc.SettingWocPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SettingTest {
    CoreFunction coreFunction = CoreFunction.getInstance();
    MainPage mainPage = MainPage.getInstance();
    SettingPage settingPage = SettingPage.getInstance();
    SettingWocPage settingWocPage = SettingWocPage.getInstance();

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
        settingPage.getGoToPersons().click();
    }

    @Test
    public void goToWOCSetting() {
        // coreFunction.startRecord();
        mainPage.getSetting().click();
        settingPage.getGoToWOCSetting().click();
        settingWocPage.getGoToLicense().click();
        settingWocPage.getGoToWorker().click();
        settingWocPage.getGoToTeam().click();
        // String screenshot = screenshot("screenshot");
        // it will be saved in build/reports/tests/screenshot.png
        settingWocPage.getGoToSet().click();
        settingWocPage.getGoToMaterial().click();
        settingWocPage.getGoToMaterialSet().click();
        settingWocPage.getGoToProject().click();
        settingWocPage.getGoToActive().click();
        // coreFunction.stopRecord();
        // file location will show in log
    }
}
