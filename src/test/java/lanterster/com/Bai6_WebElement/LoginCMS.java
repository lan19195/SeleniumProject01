package lanterster.com.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CRM
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        //Bắt WebElement Email (object)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");

        System.out.println("Text của ô Email: "+ inputEmail.getText());
        System.out.println("Name cuả ô Email: "+ inputEmail.getAttribute("name"));
        System.out.println("Class của ô Email: "+ inputEmail.getAttribute("class"));

        driver.findElement(By.name("password")).sendKeys("123456");
        inputEmail.clear();
        Thread.sleep(2000);

        WebElement checkboxRemember1 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn: "+ checkboxRemember1.isSelected());

        driver.findElement(By.xpath("//span[normalize-space()='Remember Me']")).click();
        WebElement checkboxRemember2 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn: "+ checkboxRemember1.isSelected());

        // check hàm getText()
        WebElement tieude = driver.findElement(By.xpath("//div[@class='card-body']//h1"));
        System.out.println(tieude.getText());

        WebElement buttonCopy = driver.findElement(By.xpath("//button[normalize-space()='Copy']"));
        System.out.println("trạng thái nút copy: "+ buttonCopy.isDisplayed());

        // Dimension, Location
        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        Dimension dimensions = buttonLogin.getSize();
        System.out.println("Heigh buttonLogin: "+dimensions.height + "Width buttonLogin: "+dimensions.width);
        Point point = buttonLogin.getLocation();
        System.out.println("X buttonLogin: "+ point.x + "Y buttonLogin: "+ point.y);

        if(buttonCopy.isDisplayed()==true){
            buttonCopy.click();
        }
        Thread.sleep(2000);

        System.out.println(buttonLogin.getCssValue("background-color"));
        // buttonLogin.click();
        buttonLogin.submit(); // chir khi có type = submit

        Thread.sleep(3000);
        //Tắt browser
        driver.quit();
    }
}
