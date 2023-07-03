package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class WaitExample extends BaseDriver{
    //String url = "https://www.selenium.dev/";
    String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";

    @Test
    public void testWaits () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        //Implicit waits
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //explicit waits
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement blog = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Blo2g']")));
//        blog.click();
//        Thread.sleep(5000);

        // frame switch-----------------
        int iframeNumber = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframeNumber);


        driver.switchTo().frame("packageListFrame");
        WebElement selenium = driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']"));
        selenium.click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");
        WebElement alert = driver.findElement(By.xpath("//span[normalize-space()='Alert']"));
        alert.click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("classFrame");
        WebElement accept = driver.findElement(By.xpath("//a[normalize-space()='accept']"));
        accept.click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();



    }
}
