import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)

public class BaseTest {

    WebDriver driver ;
    static String browser = System.getProperty("browser");

    @BeforeAll
    public void  setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforMethod(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Test finished.");
    }







}
