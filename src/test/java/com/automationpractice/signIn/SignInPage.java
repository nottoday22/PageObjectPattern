package com.automationpractice.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
    private WebDriverWait wait;
    private WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "email")
    private WebElement emailForm;
    @FindBy(id = "passwd")
    private WebElement passwordForm;
    By signInPageLocator = By.id("authentication");
    By signInSuccessLocator = By.id("my-account");
    By submitLoginButton = By.id("SubmitLogin");


    public void waitForSignInPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInPageLocator));
    }

    public void fillTheEmail(String email){
        emailForm.sendKeys("seleniumisgood@mail.com");
    }

    public void fillThePassword(String password){
        passwordForm.sendKeys("123456");
    }

    public void clickOnSubmitLoginButton(){
        driver.findElement(submitLoginButton).click();
    }


    public void checkSignInSuccess(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInSuccessLocator));
    }
}
