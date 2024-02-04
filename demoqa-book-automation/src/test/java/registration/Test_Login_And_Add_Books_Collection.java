package registration;

import base.BaseTest;
import org.example.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Login_And_Add_Books_Collection extends BaseTest {
    ProfileDetailPage profileDetailPage;
    LoginPage loginPage;
    ProfilePage profilePage;
    BooksPage booksPage;
    @Test
    @Order(1)
    public void user_successful_login(){
        loginPage = new LoginPage(driver);
        loginPage.setUserName();
        loginPage.setPassword();
        Assertions.assertEquals("deneme2",loginPage.getUserName(),"user name value is not correct!");
        Assertions.assertEquals("Deneme@123",loginPage.getPassword(),"password value is not correct!");
        loginPage.clickButton();
        Assertions.assertTrue(loginPage.getSearchBox());
        profilePage = new ProfilePage(driver);
        loginPage.profilePage().goToBookSubmit();
        booksPage = new BooksPage(driver);
    }

    @Test
    @Order(2)
    public void create_a_book(){
        profilePage.booksPage().selectBooks(0);
        Assertions.assertEquals("Git Pocket Guide",booksPage.getBookValue());
        booksPage.addBookCollectionClick();
    }

    @Test
    @Order(3)
    public void list_a_book(){
        profileDetailPage = new ProfileDetailPage(driver);
        Assertions.assertTrue(profileDetailPage.checkIfBooksAdded());
        //System.out.println(profileDetailPage.checkIfBooksAdded());
        profileDetailPage.getBooksName();
        System.out.println(profileDetailPage.getBooksName());

    }

    @Test
    @Order(4)
    public void delete_a_book(){
        profileDetailPage.deleteBook();
        profileDetailPage.deleteAcceptButton();
        profileDetailPage.deleteClosedAlert();
    }

    @Test
    @Order(5)
    public void log_out(){
        Assertions.assertTrue(profilePage.isOnLogOutPage());
        profilePage.logOutButton();
    }
}
