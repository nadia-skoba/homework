import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("Відкриваю сайт https://www.saucedemo.com ");
        driver.get("https://www.saucedemo.com");
        String actualTitle = driver.getTitle();
        String expectedText = "Swag Labs";
        if (actualTitle.contains(expectedText)) {
            System.out.println("Успішна виконена перевірка");
        } else {
            System.out.println("Помилка");
        }

        driver.quit();
    }
}