package com.example.demo.threads;

public class main {
    public static void main(String[] args) {
        Thread settingTestThread = new Thread(new SettingTestThread());
        Thread mainPageTestThread = new Thread(new MainPageTestThread());
        settingTestThread.start();
        mainPageTestThread.start();
    }
}
