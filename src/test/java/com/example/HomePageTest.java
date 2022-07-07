package com.example;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{


    @Test
    public void invalidEmail(){
        HomePage homePage = new HomePage(driver);
        homePage.openWatchDemo();
        WatchDemoPage watchDemoPage =new WatchDemoPage(driver);
        watchDemoPage.singInDemo("perli", "ben david", "perliBBB");

    }
}
