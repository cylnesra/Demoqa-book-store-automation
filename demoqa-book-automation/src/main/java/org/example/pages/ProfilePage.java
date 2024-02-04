package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.Collection.LocatorsCollection.*;
import static org.example.Collection.LocatorsCollection.*;

public class ProfilePage  extends BasePage {
    BooksPage booksPage;
    public ProfilePage(WebDriver driver){
        super(driver);
        booksPage = new BooksPage(driver);
    }

    public BooksPage booksPage(){
        return this.booksPage;
    }
    public void goToBookSubmit(){
        maximize();
        JsScroll(goToBookStoreButton);
        waitDriver(goToBookStoreButton);
        click(goToBookStoreButton);
    }

    public boolean isOnLogOutPage(){
        return isDisplayed(logOutButtonLocator);
    }
    public  void logOutButton(){
        click(logOutButtonLocator);
    }

}
