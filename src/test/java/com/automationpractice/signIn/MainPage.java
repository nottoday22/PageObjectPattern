package com.automationpractice.signIn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }


    By login = By.cssSelector("a.login");

    public void open(){
        driver.get("http://automationpractice.com/index.php");
    }

    public void getTitle(){
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store"));
    }

    public void clickSignInButton(){
        driver.findElement(login).click();
    }

}
