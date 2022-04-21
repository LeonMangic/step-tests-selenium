import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import org.junit.Test;

import static org.junit.Assert.fail;

public class UITest {

    public static final String CHROME_DRIVER_PATH = "\\C:\\Users\\leonm\\Desktop\\chromedriver_win32\\chromedriver.exe"; // change this path to your local chrome driver

    @Test

    public void testStepLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/#/root/plans/list");

        Thread.sleep(2000);  // Let the user actually see something!

        WebElement userNameField = driver.findElement(By.name("username"));

        userNameField.clear();

        Thread.sleep(1000);

        userNameField.sendKeys("admin");

        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.name("password"));

        passwordField.clear();

        Thread.sleep(1000);

        passwordField.sendKeys("init");

        Thread.sleep(1000);

        passwordField.submit();

        Thread.sleep(1000);

        try {
            WebElement planTab = driver.findElement(By.xpath("//button[text()='New plan']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        driver.quit();

    }

    @Test

    public void testStepLoginAndClickingOnTabs() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/#/root/plans/list");

        Thread.sleep(2000);  // Let the user actually see something!

        WebElement userNameField = driver.findElement(By.name("username"));

        userNameField.clear();

        Thread.sleep(1000);

        userNameField.sendKeys("admin");

        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.name("password"));

        passwordField.clear();

        Thread.sleep(1000);

        passwordField.sendKeys("init");

        Thread.sleep(1000);

        passwordField.submit();

        Thread.sleep(1000);

        try {
            WebElement planTab = driver.findElement(By.xpath("//button[text()='New plan']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement keywordsTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-record']")); //Keywords tab

        keywordsTab.click();

        Thread.sleep(1000);

        try {
            WebElement newKeyword = driver.findElement(By.xpath("//button[text()='New keyword']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement parametersTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-list-alt']")); //Parameters tab

        parametersTab.click();

        Thread.sleep(1000);

        try {
            WebElement newParameter = driver.findElement(By.xpath("//button[text()='New parameter']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement executionsTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-tasks']")); //Executions tab

        executionsTab.click();

        Thread.sleep(1000);

        try {
            WebElement entriesList = driver.findElement(By.xpath("//*[@class='dataTables_info']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement schedulerTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-time']")); //Scheduler tab

        schedulerTab.click();

        Thread.sleep(1000);

        try {
            WebElement newTask = driver.findElement(By.xpath("//button[text()='New task']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement gridTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-th']")); //Grid tab

        gridTab.click();

        Thread.sleep(1000);

        try {
            WebElement entriesList = driver.findElement(By.xpath("//*[@class='dataTables_info']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement adminTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-cog']")); //Admin tab

        adminTab.click();

        Thread.sleep(1000);

        try {
            WebElement newTask = driver.findElement(By.xpath("//button[text()='Add user']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement helpTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-question-sign']")); //Help button

        helpTab.click();

        Thread.sleep(1000);

        try {
            WebElement helpDoc = driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement hamburgerTab = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-menu-hamburger']")); //Hamburger button

        hamburgerTab.click();

        Thread.sleep(1000);

        try {
            WebElement hamburgerMenu = driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement resourcesTab = driver.findElement(By.xpath("//*[text()='Resources']")); //Resources

        resourcesTab.click();

        Thread.sleep(1000);

        try {
            WebElement newResource = driver.findElement(By.xpath("//button[text()='New resource']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement hamburgerTab1 = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-menu-hamburger']"));

        hamburgerTab1.click();

        Thread.sleep(1000);

        try {
            WebElement hamburgerMenu1 = driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement currentOperationsTab = driver.findElement(By.xpath("//*[text()='Current Operations']")); //Current Operations

        currentOperationsTab.click();

        Thread.sleep(1000);

        try {
            WebElement entriesList = driver.findElement(By.xpath("//*[@class='dataTables_info']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement hamburgerTab2 = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-menu-hamburger']"));

        hamburgerTab2.click();

        Thread.sleep(1000);

        try {
            WebElement hamburgerMenu2 = driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        WebElement keywordPackagesTab = driver.findElement(By.xpath("//*[text()='Keyword packages']")); //Current Keyword packages

        keywordPackagesTab.click();

        Thread.sleep(1000);

        try {
            WebElement newKeywordPackage = driver.findElement(By.xpath("//button[text()='New Keyword Package']"));
        } catch (Exception e) {
            fail("Element not found");
        }

        Thread.sleep(3000);

        driver.quit();
    }

}