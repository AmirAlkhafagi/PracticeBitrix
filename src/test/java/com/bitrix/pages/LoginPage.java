package com.bitrix.pages;

import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{

    @FindBy (name = "USER_LOGIN")
    protected static WebElement usernameInputBox;

    @FindBy (name = "USER_PASSWORD")
    protected static WebElement passwordInputBox;

    public static void login(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password + Keys.ENTER);
    }

    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password ,Keys.ENTER);
    }

    public static void getUrl(){
        String url = ConfigurationReader.getProperty("url");

        Driver.getDriver().get(url);
    }

    public static String getPageTitle(){
        String title = Driver.getDriver().getTitle();

        return title;
    }
    // test test test

    @FindBy (css = "[class ='errortext']")
    private WebElement warningMessage;

    public String getWarningMessageText() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return warningMessage.getText().trim();
    }




}
