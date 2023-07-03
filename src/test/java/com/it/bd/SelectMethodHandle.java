package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandle extends BaseDriver{
    String url = "https://www.amazon.com/";
    @Test
    public void selectTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        WebElement menuOptions = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(menuOptions);

        //select by index
        select.selectByIndex(5);
        Thread.sleep(3000);
        //select by value
        select.selectByValue("search-alias=fashion-boys-intl-ship");
        Thread.sleep(3000);
        //select by VisibleText
        select.selectByVisibleText("Computers");
        Thread.sleep(3000);


    }
}
