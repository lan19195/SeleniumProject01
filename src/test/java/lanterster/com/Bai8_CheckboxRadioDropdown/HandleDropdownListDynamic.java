package lanterster.com.Bai8_CheckboxRadioDropdown;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);
        // click vào dropdown Category
        driver.findElement(By.xpath("//a[@class='chosen-single']/span[normalize-space()='Select a Category']")).click();
        // search giá trị cần chọn
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        // click chọn Text đã search (cần chọn)
        sleep(1);
        //driver.findElement(By.xpath("//ul[@class='chosen-results']/li[normalize-space()='Travel']")).click();

        // dùng enter thay cho click - cách này dùng cho T/H chỉ hiển thị 1 giá trị lựa chọn
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

        closeDriver();
    }
}
