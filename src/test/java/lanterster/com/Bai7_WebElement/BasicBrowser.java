package lanterster.com.Bai7_WebElement;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        creatDriver();

        driver.navigate().to("https://anhtester.com/");
        sleep(2);

//        driver.findElement(By.id("btn-login")).click();
//        // Điều hướng về lịch sử trang trước đó
//        driver.navigate().back();
//        sleep(2);
//
//        // Làm mới trang hiện tại
//        driver.navigate().refresh();
//        sleep(2);
//
//         // Điều hướng đến trang tiếp sau
//        driver.navigate().forward();
//        sleep(2);

        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println(driver.getCurrentUrl());
        // Get the current page HTML source
        System.out.println(driver.getPageSource());

        closeDriver();
    }
}
