package lanterster.com.Bai7_WebElement;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        driver.findElement(By.xpath("//button[normalize-space()='Copy']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        List<WebElement> listMenu = (List<WebElement>) driver.findElements(By.xpath("//ul[@id='main-menu']/li/a/span[@class=\"aiz-side-nav-text\"]"));
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i).getText());
        }
        sleep(2);
        closeDriver();
    }
}
