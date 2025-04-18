package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//TODO: load allo.ua, and search for a phone

public class MySearchPhoneTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @Test
    public void myWebTest() {
        driver.get("https://allo.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Iphone 16");
        searchInput.sendKeys(Keys.ENTER);
        System.out.println("We found phone!");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
