package lanterster.com.ThucHanh;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {
    // login to CRM system
    public static void signinCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }

    // Open Client page
    public static void openClientPage() {
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(1);
    }

    // Enter data on Add client dialog
    public static void enterDataAddClient(String clientName) {
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(clientName);
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);

        driver.findElement(By.id("address")).sendKeys("Nhon");
        driver.findElement(By.id("city")).sendKeys("Hanoi");
        driver.findElement(By.id("state")).sendKeys("Nam Tu Liem");
        driver.findElement(By.id("zip")).sendKeys("100000");
        driver.findElement(By.id("country")).sendKeys("Viet Nam");
        driver.findElement(By.id("phone")).sendKeys("033xxxx350");
        driver.findElement(By.id("website")).sendKeys("lantester.com");
        driver.findElement(By.id("vat_number")).sendKeys("0");

        // Cuộn chuột đến element label cuối để thấy được các element bị che
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP", Keys.ENTER);

        driver.findElement(By.xpath("//label[normalize-space()='Date of Birth']//parent::div//input")).sendKeys("19-01-1995");

        // click save button
        sleep(2);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    }

    // Search Client after Added
    public static void checkClientAfterAdded(String clientName) {
        sleep(2);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody/tr[1]/td[2]")).getText();
        System.out.println(clientNameInTable);
    }

    public static void main(String[] args) {
        creatDriver();
        signinCRM();
        openClientPage();
        enterDataAddClient("sanjay kumar - founder and creater - selectorshub");
        checkClientAfterAdded("sanjay kumar - founder and creater - selectorshub");
        closeDriver();
    }
}
