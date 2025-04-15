package googleform;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestCases {

    WebDriver driver;
    WebDriverWait wait;
    WebElement twoSum;
    WrapperMethods wrapper;

    public TestCases(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.wrapper = new WrapperMethods();
    }

    public void HomePage() {

        wrapper.verifyURL(driver, "leetcode");

    }

    public void ProblemSet() {

        WebElement problemSet = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[contains(text(), 'View Questions')]")));
        wrapper.click(problemSet);

        wrapper.verifyURL(driver, "problemset");

        List<WebElement> problems = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//a[@class=\"h-5 hover:text-blue-s dark:hover:text-dark-blue-s\"]")));

        System.out.println("Total problems found: " + problems.size());

        int num = 0;

        for (WebElement problem : problems) {

            String title = problem.getText();
            System.out.println(title);
            if (title.contains("Two Sum")) {
                twoSum = problem;
            }

            if (num == 5) {
                break;
            }

            num++;

        }

        Assert.assertNotNull(twoSum, "'Two Sum' problem was not found.");

    }

    public void TwoSumProblem() {

        Assert.assertNotNull(twoSum, "Cannot click 'Two Sum' – element is null.");
        wrapper.click(twoSum);

        wrapper.verifyURL(driver, "two-sum");

    }

    public void RegisterSignin() {

        WebElement submitTab = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"submissions_tab\"]/div[2]/div[2]")));
        wrapper.click(submitTab);

        WebElement registration = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[text()='Register or Sign In']")));

        Assert.assertTrue(registration.isDisplayed(), "Register or Sign In link is not visible.");
        System.out.println("Register or Sign In is visible.");

    }
}
