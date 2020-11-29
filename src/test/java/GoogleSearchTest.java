import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {

    private WebDriver driver;
    private String baseURL = "https://www.google.com/";


    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {

        driver.get(baseURL);

        WebElement textBox = driver.findElement(By.id("gsr"));

        textBox.sendKeys("Automation");

        List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));

        int count = listOfInputElements.size();
        System.out.println("Count of Input Elements: "+count);
    }
}
