package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.Collection.LocatorsCollection.*;

public class BooksPage extends BasePage {
    public BooksPage(WebDriver driver){
        super(driver);
    }
    public void selectBooks(int i){
        waitDriver(bookLocator);
        getAllBooks().get(i).click();
    }
    private List<WebElement> getAllBooks(){
        waitDriver(bookLocator);
        return findAll(booksLocator);
    }

    public String getBookValue(){
        JsScroll(addToBookCollectionButton);
        waitDriver(bookTitleLocator);
        return find(bookTitleLocator).getText();
    }

    public void addBookCollectionClick(){
        click(addToBookCollectionButton);
        try{
            alertAccept();
        }catch(NoAlertPresentException e){
            System.out.println("There is no warning window");
        }
    }
}
