package com.automationpractice.signIn;

import com.automationpractice.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignIn extends WebDriverSettings {

    @Test
    public void SignIn() {

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

        mainPage.open();

        mainPage.getTitle();

        mainPage.clickSignInButton();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        signInPage.waitForSignInPage();

        signInPage.fillTheEmail("seleniumisgood@mail.com");

        signInPage.fillThePassword("123456");

        signInPage.clickOnSubmitLoginButton();

        signInPage.checkSignInSuccess();


    }
}
