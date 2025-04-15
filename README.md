# X_LeetCode_Project
📘 README: LeetCode Automation with Selenium and TestNG
📌 Project Overview
This project automates a basic UI test flow for the LeetCode website using Selenium WebDriver, TestNG, and Java. The automation covers navigating to the homepage, accessing the problem set, locating a specific problem ("Two Sum"), and verifying the visibility of the Register or Sign In link.

📁 Project Structure
cpp
Copy
Edit
googleform/
├── AppTest.java          // Test setup and execution
├── TestCases.java        // All test steps and logic
└── WrapperMethods.java   // Reusable utility methods
🚀 Features Tested
✅ Validates that the user lands on the LeetCode homepage.

✅ Navigates to the problem set using the "View Questions" link.

✅ Searches for the "Two Sum" problem in the list.

✅ Verifies if the problem's page is loaded correctly.

✅ Triggers the "Submissions" tab and checks for "Register or Sign In" visibility.

🧪 Test Breakdown
1. AppTest.java
Responsible for:

Launching the Chrome browser.

Navigating to the LeetCode homepage.

Instantiating the TestCases class.

Running all test methods in sequence.

Closing the browser after test execution.

2. TestCases.java
Core of the test logic, which includes:

HomePage() – Verifies if current URL contains “leetcode”.

ProblemSet() – Clicks on "View Questions", checks URL, and looks for "Two Sum".

TwoSumProblem() – Clicks the “Two Sum” link and validates the URL.

RegisterSignin() – Clicks "Submissions" tab and checks visibility of “Register or Sign In”.

3. WrapperMethods.java
Utility/helper class containing reusable methods:

click(WebElement) – Safe click operation only if element is visible and enabled.

verifyURL(WebDriver, String) – Checks whether the current URL contains a specific keyword.

🔧 Technologies Used
Tool/Library	Purpose
Java	Programming Language
Selenium WebDriver	UI Automation
TestNG	Test Framework
WebDriverManager	Driver setup & management
Maven/Gradle	(Optional) Build Tool
🛠️ How to Run the Project
Clone the repo

bash
Copy
Edit
git clone https://github.com/yourusername/leetcode-automation.git
Open in VS Code or IntelliJ

Add Dependencies Ensure these are added to your pom.xml or classpath:

Selenium Java

TestNG

WebDriverManager

Run the Test From terminal or TestNG XML:

bash
Copy
Edit
mvn test
Or run AppTest.java directly from your IDE.

📌 Sample Output
mathematica
Copy
Edit
Current URL: https://leetcode.com/
TestCase Pass: URL contain: 'leetcode'

Navigated to: https://leetcode.com/problemset
TestCase Pass: URL contain: 'problemset'

Total problems found: 50
Two Sum
...

Current URL after clicking Two Sum: https://leetcode.com/problems/two-sum
TestCase Pass: URL contain: 'two-sum'

Register or Sign In is visible.
💡 Future Improvements
Add page object model (POM) for better scalability.

Integrate with ExtentReports or Allure for reporting.

Parameterize inputs like URL or problem name.

Add exception logging using a logger (e.g., Log4j or SLF4J).

📬 Contact
Feel free to connect if you have any suggestions or issues: Name: Your Name
Email: muhammedshoaib06@gmail.com
GitHub: github.com/yourusername


