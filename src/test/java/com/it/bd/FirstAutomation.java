package com.it.bd;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{

    @Test
    public void firstTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.3");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
    }
}
