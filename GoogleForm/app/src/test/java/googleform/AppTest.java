package googleform;

import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    WebDriver driver;
    TestCases testCase;

    @BeforeClass(alwaysRun = true)
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leetcode.com/");
        testCase = new TestCases(driver);
    }

    @Test
    public void runAllTestCases() throws InterruptedException {
        testCase.HomePage();
        testCase.ProblemSet();
        testCase.TwoSumProblem();
        testCase.RegisterSignin();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownTest() {
        System.out.println("Closing the browser...");
        if (driver != null) {
            driver.quit();
        }
    }
}
