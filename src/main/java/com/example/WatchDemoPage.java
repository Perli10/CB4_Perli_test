package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.testng.Assert.assertTrue;

public class WatchDemoPage {

    WebDriver driver;

    @FindBy(id = "form-field-firstname")
    WebElement firstName;
    @FindBy(id = "form-field-lastname")
    WebElement lastName;
    @FindBy(id = "form-field-email")
    WebElement email;
    @FindBy(xpath = "//span[text()='watch now']")
    WebElement watchBtn;


    public WatchDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void singInDemo(String firstN, String lastN, String workEmail){
        firstName.sendKeys(firstN);
        lastName.sendKeys(lastN);
        email.sendKeys(workEmail);
        watchBtn.click();
        assertTrue(lastName.isDisplayed());
    }
}
