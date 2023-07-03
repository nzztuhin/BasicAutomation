package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class CopyAndPasteHandle extends BaseDriver{
    String url = "https://demoqa.com/automation-practice-form";

    @Test
    public void CopyAndPasteTest () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        Actions action = new Actions(driver);

        WebElement firstName = driver.findElement(By.xpath("(//input[@id='firstName'])[1]"));
        firstName.sendKeys("Nuruzzaman");
        Thread.sleep(3000);

        //select all
        action.keyDown(Keys.CONTROL);
        action.sendKeys("a");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        //copy
        action.keyDown(Keys.CONTROL);
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        Thread.sleep(3000);


        //Tab
        firstName.sendKeys(Keys.TAB);
        action.build().perform();
        Thread.sleep(3000);

        //WebElement lastName = driver.findElement(By.xpath("(//input[@id='lastName'])[1]"));
        //paste
        action.keyDown(Keys.CONTROL);
        action.sendKeys("v");
        action.build().perform();
        Thread.sleep(3000);
    }
}
