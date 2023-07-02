package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class MouseHoverHandling extends BaseDriver{
    String url = "https://www.daraz.com.bd/";
    @Test
    public void mouseHoverTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        Actions action = new Actions(driver);

        WebElement electronicAccessories = driver.findElement(By.xpath("//span[normalize-space()='Electronic Accessories']"));
        action.moveToElement(electronicAccessories).perform();
        Thread.sleep(5000);

        WebElement storage = driver.findElement(By.xpath("//span[normalize-space()='Storage']"));
        action.moveToElement(storage).perform();
        Thread.sleep(5000);

        WebElement flashDrives = driver.findElement(By.xpath("//span[normalize-space()='Flash Drives']"));
        flashDrives.click();
        Thread.sleep(5000);


    }

}
