package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommandsExample extends BaseDriver{

    String url = "https://demoqa.com/automation-practice-form";

    @Test
    public void webElementTest () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        WebElement firstName = driver.findElement(By.xpath("(//input[@id='firstName'])[1]"));
        firstName.sendKeys("Nuruzzaman");
        Thread.sleep(3000);

//        WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
//        dob.click();
//        Thread.sleep(3000);

        WebElement lastName = driver.findElement(By.xpath("(//input[@id='lastName'])[1]"));
        lastName.sendKeys("Tuhin");
        Thread.sleep(3000);
//get attribute value
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        System.out.println("Attribute value: "+ email.getAttribute("pattern"));
        System.out.println("Attribute value: "+ email.getAttribute("placeholder"));
        Thread.sleep(3000);

 //get text
        WebElement text = driver.findElement(By.xpath("//h5[normalize-space()='Student Registration Form']"));
        String formValue = text.getText();
        System.out.println(formValue);
        System.out.println("get css value: "+ text.getCssValue("font-size"));
        Thread.sleep(3000);


        if(email.isDisplayed()){
            email.sendKeys("test@edu.io");
            Thread.sleep(3000);
        }
        else {
            System.out.println("Email address is not locatable");
        }


//        WebElement sports = driver.findElement(By.xpath("(//label[normalize-space()='Sports']"));
//
//        if(!sports.isSelected()){
//            sports.click();
//        }
//        else{
//            System.out.println("already selected");
//        }

    }
}
