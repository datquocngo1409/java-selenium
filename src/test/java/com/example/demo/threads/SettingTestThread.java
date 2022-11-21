package com.example.demo.threads;

import com.example.demo.tests.SettingTest;

public class SettingTestThread implements Runnable {
    @Override
    public void run() {
        SettingTest settingTest = new SettingTest();
        settingTest.setUp();
        settingTest.goToSetting();
        settingTest.goToWOCSetting();
    }
}
