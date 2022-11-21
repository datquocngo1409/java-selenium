package com.example.demo.threads;

import com.example.demo.tests.MainPageTest;

public class MainPageTestThread implements Runnable {
    @Override
    public void run() {
        MainPageTest mainPageTest = new MainPageTest();
        mainPageTest.setUp();
        mainPageTest.testUserMenu();
        mainPageTest.goToSetting();
    }
}
