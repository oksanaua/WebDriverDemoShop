import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("http://demowebshop.tricentis.com/");

       WebElement searchField = driver.findElement(By.id("small-searchterms"));
       searchField.sendKeys("computer");
       searchField.submit();

       WebDriverWait wait = new WebDriverWait(driver, 10); //explicit way
       wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Build your own cheap computer")));

       WebElement productLink = driver.findElements(By.linkText("Build your own cheap computer")).get(0);
       productLink.click();

       WebElement imageElement = driver.findElements(By.cssSelector("a[class = thumb-popup-link]")).get(0);

       WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
       imageLink.click();

       driver.quit();

    }

}
