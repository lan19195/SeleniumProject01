package lanterster.com.Bai7_WebElement;

import lanterster.com.Common.BaseTest;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class InterfaceOptions extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.get("https://anhtester.com");

        // Add a new cookie
        Cookie newCookie = new Cookie("customName", "121423423412@!hdwv%46b");
        driver.manage().addCookie(newCookie);
        System.out.println(driver.manage().getCookieNamed("customName"));

// Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.toString());

//// Delete a cookie by name
//        driver.manage().deleteCookieNamed("CookieName");
//
//// Delete all cookies
//        driver.manage().deleteAllCookies();
        closeDriver();
    }
}
