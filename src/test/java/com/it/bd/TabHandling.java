package com.it.bd;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandling extends BaseDriver{
    String url1 = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
    String url2 = "https://testng.org/doc/download.html";

    @Test
    public void tabHandlingTest () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url1);
        String originalTab = driver.getWindowHandle();
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url2);
        String secondTab = driver.getWindowHandle();
        Thread.sleep(3000);

        driver.switchTo().window(originalTab);
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(secondTab);
        Thread.sleep(3000);

    }
}
