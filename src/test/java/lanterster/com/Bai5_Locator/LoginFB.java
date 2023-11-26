package lanterster.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginFB
{public static void main(String[] args) throws InterruptedException {

    //Khởi tạo browser với Chrome
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //Mở trang Anh tester
    driver.get("https://crm.anhtester.com/admin/authentication");
    Thread.sleep(3000);

    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();

    Thread.sleep(3000);
    //Tắt browser
    driver.quit();
}
}
