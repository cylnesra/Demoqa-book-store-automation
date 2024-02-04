package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

   protected String profileUrl = "https://demoqa.com/profile";
    WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(5));
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        wait.until(ExpectedConditions.visibilityOf(find(locator)));
        find(locator).click();
    }

    public void type(By locator, String text){
         find(locator).sendKeys(text);
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void waitDriver(By locator){
       // wait.pollingEvery(Duration.ofMillis(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void JsScroll(By locator){
        WebElement element = find(locator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void iframe(By locator){
        driver.switchTo().frame(find(locator));
    }

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void alertAccept(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

}
