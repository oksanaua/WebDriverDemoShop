import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/build-your-cheap-own-computer");

        List<WebElement> radioButtons = driver.findElements(By.name("product_attribute_72_5_18"));
        radioButtons.get(0).click();

        for (WebElement radioButton : radioButtons) {      //display also value
            if(radioButton.isSelected()) {
                System.out.println(radioButton.getAttribute("value"));
            }
        }

        driver.quit();
    }
}
