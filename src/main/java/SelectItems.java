import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItems {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/books");

        WebElement selectElement = driver.findElement(By.id("products-orderby"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Price: Low to High");

        driver.quit();


    }
}
