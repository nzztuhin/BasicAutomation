package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BaseDriver{
    @Test
    public void testLocators() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.shohoz.com/contact-us/en");
        //driver.get("https://member.daraz.com.bd/user/login");
        Thread.sleep(3000);

//BY ID
        WebElement bus = driver.findElement(By.id("purpose"));
        bus.click();
        Thread.sleep(3000);

//BY Name
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        Thread.sleep(3000);
//BY linkText
        WebElement launch = driver.findElement(By.linkText("Launch"));
        launch.click();
        Thread.sleep(3000);

//Partial LinkText
        WebElement launch1 = driver.findElement(By.partialLinkText("Contact"));
        launch1.click();
        Thread.sleep(3000);

//By Class
        WebElement send = driver.findElement(By.className("btn"));
        send.click();
        Thread.sleep(3000);

//		WebElement login = driver.findElement(By.className("next-btn"));
//		login.click();
//		Thread.sleep(3000);

        /*
         * Custom Xpath->
         * //tagName[@attribute='value']
         * //tagName[contains(text(),'text')]
         * //*[contains(text(),'text')]
         */

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("test@noemail.com");
        Thread.sleep(3000);

        //css -> elementName[attributeName='attributeValue']
        WebElement name = driver.findElement(By.cssSelector("input[name='dest_from']"));

    }
}
