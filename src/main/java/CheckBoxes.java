import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demowebshop.tricentis.com/build-your-cheap-own-computer");

        WebElement checkbox = driver.findElement(By.id("product_attribute_72_8_30_93"));

        checkbox.click();

        Thread.sleep(1000);
        driver.quit();

    }
}
