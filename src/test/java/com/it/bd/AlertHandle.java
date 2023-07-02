package com.it.bd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandle extends BaseDriver{
    String url = "https://demoqa.com/alerts";

    @Test
    public void alertsTest () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);



        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);

        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmButton.click();
        Thread.sleep(3000);

        //alert.accept();
        alert.dismiss();
        Thread.sleep(3000);

        WebElement confirmResult =driver.findElement(By.xpath("//span[@id='confirmResult']"));
        System.out.println(confirmResult.getText());



        WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
        promtButton.click();
        Thread.sleep(3000);

        alert.sendKeys("hello");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);



    }
}
