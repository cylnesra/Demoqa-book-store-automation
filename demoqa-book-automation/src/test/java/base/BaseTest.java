package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {
   protected WebDriver driver;

    @BeforeAll
   public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://demoqa.com/login");
       //driver.manage().window().maximize();
   }
    @AfterAll
   public void tearDown(){
      driver.quit();
   }
}
