package com.it.bd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends BaseDriver{
    String url = "https://www.selenium.dev/";
    @Test
    public void testAssertion () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        String expectedTitle ="Selenium";
        String actualTitle = driver.getTitle();

        //Hard Assertion
        //Assert.assertEquals(actualTitle, expectedTitle);

        //soft Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualTitle,expectedTitle);

        System.out.println("assertion pass");
        Thread.sleep(5000);
        soft.assertAll();
    }
}
