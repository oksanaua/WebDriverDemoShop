package googlelink;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrowserTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement textBox = driver.findElement(By.id("gsr"));

        textBox.sendKeys("Automation");

        List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));

        int count = listOfInputElements.size();
        System.out.println("Count of Input Elements: "+count);


        Thread.sleep(3000);

        driver.quit();


    }

}
