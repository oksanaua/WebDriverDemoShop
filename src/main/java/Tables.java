import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://webtricksandtreats.com/table-style-css/");

        WebElement outerTable = driver.findElement(By.className("table-style-one"));
        WebElement row = outerTable.findElements(By.tagName("td")).get(2);
        System.out.println(row.getText());


        //WebElement row = driver.findElement(By.xpath("/html/body/article[2]/div[3]/table[1]/tbody/tr[1]/td[3]"));
        //System.out.println(row.getText());

        driver.quit();

    }
}
