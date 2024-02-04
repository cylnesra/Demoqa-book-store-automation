package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.Collection.LocatorsCollection.*;

public class ProfileDetailPage extends BasePage {
    public ProfileDetailPage(WebDriver driver){
        super(driver);
        driver.get(profileUrl);
    }
    public boolean checkIfBooksAdded(){
       return getAllBookList().size() > 0;
    }

    public String getBooksName(){
       return find(bookList).getText();
    }
    private List<WebElement> getAllBookList(){
        waitDriver(bookLocator);
        return findAll(bookList);
    }
    public void deleteBook(){
        waitDriver(bookList);
        JsScroll(deleteBookButton);
        click(deleteBookButton);
    }

    public void deleteAcceptButton(){
        waitDriver(deleteAccept);
        click(deleteAccept);
    }

    public void deleteClosedAlert(){
        alertAccept();
    }
}
