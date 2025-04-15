package googleform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WrapperMethods {
    
    public void click(WebElement Element) {

        if (Element.isDisplayed() && Element.isEnabled()) {
            Element.click();
        }else {
            System.out.println("Element is not Clickable.");
        }

    }

    public void verifyURL(WebDriver driver, String givenText) {

        String URL = driver.getCurrentUrl();
        System.out.println("Current URL: " + URL);

        if (URL.contains(givenText)) {
            System.out.println("TestCase Pass: URL contain: "+"'"+givenText+"'");
        } else {
            System.out.println("TestCase Fail: URL does not contain: "+"'"+givenText+"'");
        }

    }
}
