package lanterster.com.Bai8_CheckboxRadioDropdown;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        // kiểm tra checkbox mặc định
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println("trạng thái checkbox mặc định: " + checkboxStatusBefore);

        // nếu checkbox chưa chọn (false) thì click chọn
        if(checkboxStatusBefore == false){
            checkboxOne.click();
        }

        // kiểm tra lại kết quả sau khi click chọn
        sleep(1);
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println("trạng thái checkbox sau khi đã chọn: " + checkboxStatusAfter);

        // kiểm tra thông báo liên quan với kết quả khi đã chọn
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("trạng thái Message: " + message.isDisplayed());
        System.out.println(message.getText());





        closeDriver();

    }
}
