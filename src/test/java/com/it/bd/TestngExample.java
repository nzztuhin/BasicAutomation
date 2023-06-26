package com.it.bd;

import org.testng.annotations.*;

public class TestngExample {

    @BeforeSuite
    public void beforeSuiteTest(){
        System.out.println("This is before suite");
    }
    @Test(priority = 1)
    public void firstTest(){
        System.out.println("This is first Test");
    }
    @Test(priority = 0)
    public void secondTest(){
        System.out.println("This is second Test");
    }
    @AfterSuite
    public void afterSuiteTest(){
        System.out.println("This is after suite");
    }
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("This is before Test");
    }
    @AfterTest
    public void afterTestMethod(){
        System.out.println("This is after Test");
    }
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("This is before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("This is after Class");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("This is before Method");
    }
    @AfterMethod
    public void afterMethodTest(){
        System.out.println("This is after Method");
    }


}
