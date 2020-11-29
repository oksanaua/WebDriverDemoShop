import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItBooks {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://it-ebooks.info/");

        driver.findElement(By.id("q")).click();

        driver.findElement(By.id("q")).sendKeys("QA");

        Thread.sleep(2000);
        driver.findElement(By.id("q")).sendKeys(Keys.RETURN);

        Thread.sleep(4000);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20/*10 seconds timeout*/);

        driver.quit();

    }
}
