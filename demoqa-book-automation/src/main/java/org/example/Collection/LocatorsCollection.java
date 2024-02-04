package org.example.Collection;

import org.openqa.selenium.By;

public class LocatorsCollection {
    public static final By userNameLocator = By.id("userName");
    public static final By passwordLocator = By.id("password");
    public static final By loginSubmitLocator = By.id("login");
    public static final By searchBoxLocator = By.xpath("//input[@id='searchBox']");
    public static final By goToBookStoreButton = By.id("gotoStore");
    public static final By booksLocator = By.cssSelector("div.action-buttons");
    public static final By bookLocator = By.xpath("//span[@id='see-book-Git Pocket Guide']");
    public static final By bookTitleLocator = By.xpath("(//div/label[@id='userName-value'])[3]");
    public static final By addToBookCollectionButton = By.xpath("//div[@class='text-right fullButton']");
    public static final By deleteBookButton = By.id("delete-record-undefined");
    public static final By deleteAccept = By.id("closeSmallModal-ok");
    public static final By bookList = By.cssSelector("div.rt-tr-group");
    public static final By logOutButtonLocator = By.xpath("//div[@class='text-right col-md-5 col-sm-12']/button");
}
