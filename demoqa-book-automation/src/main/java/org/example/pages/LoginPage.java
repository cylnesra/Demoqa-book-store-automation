package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.Collection.LocatorsCollection.*;

public class LoginPage extends BasePage {
    ProfilePage profilePage;
    public LoginPage(WebDriver driver){
        super(driver);
        profilePage = new ProfilePage(driver);
    }

    public ProfilePage profilePage(){
        return this.profilePage;
    }
   public void setUserName(){
       JsScroll(loginSubmitLocator);
       type(userNameLocator,"deneme2");
   }

   public void setPassword(){
        type(passwordLocator,"Deneme@123");
   }

   public String getUserName(){
        return find(userNameLocator).getAttribute("value");
   }

    public String getPassword(){
        return find(passwordLocator).getAttribute("value");
    }

    public void clickButton(){
        click(loginSubmitLocator);
    }
    public boolean getSearchBox(){
        waitDriver(searchBoxLocator);
       return isDisplayed(searchBoxLocator);
    }
}
