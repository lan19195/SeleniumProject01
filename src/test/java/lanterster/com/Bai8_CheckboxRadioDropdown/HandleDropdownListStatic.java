package lanterster.com.Bai8_CheckboxRadioDropdown;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        // khởi tạo đối tượng select và giá trị là một WebElement của thẻ select trong HTML
        Select select = new Select(selectElement);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của Select: "+select.isMultiple());
        System.out.println("Số lượng options trong select: "+select.getOptions().size());

        // get option với các hàm hỗ trợ của class Select
        select.selectByVisibleText("Wednesday");
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);

        select.selectByValue("Monday");
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);

        select.selectByIndex(6);
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);

        closeDriver();
    }
}
