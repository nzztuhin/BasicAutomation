package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollHandle extends BaseDriver{
    String url = "https://www.amazon.com/";
    @Test
    public void scrollTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        Thread.sleep(5000);
        //Scroll UP
        js.executeScript("window.scrollTo(0,0)", "");
         Thread.sleep(5000);

         //specific location
         WebElement location1 = driver.findElement(By.xpath("//div[@aria-label='More on Amazon']"));
         js.executeScript("arguments[0].scrollIntoView(true);", location1);
         Thread.sleep(5000);
    }
}
