package lanterster.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRM {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang Ecommerce
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        //Điền email - Tìm theo ID với By.id()
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //Điền passwprd - Tìm theo Name với By.name()
        driver.findElement(By.name("password")).sendKeys("123456");

        //Click link Forgot password ? - By.
        //driver.findElement(By.linkText("Forgot password ?")).click();
        driver.findElement(By.partialLinkText("Forgot ")).click();

        Thread.sleep(1000);
        //Tắt browser
        driver.quit();
    }
}
