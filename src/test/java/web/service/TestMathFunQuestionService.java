package web.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMathFunQuestionService {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavish Computers\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }



    @Test
    public void testLoginPage() {
        driver.get("http://localhost:8080/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement dob = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid credentials
        username.sendKeys("ameet");
        password.sendKeys("ameet_pass");
        dob.sendKeys("12-23-1997");

        submitButton.click();

        // Verify redirection to q1 page
        Assert.assertTrue(driver.getCurrentUrl().contains("/q1"));
    }

    @Test
    public void testInvalidLogin() {
        driver.get("http://localhost:8080/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement dob = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter invalid credentials
        username.sendKeys("invaliduser");
        password.sendKeys("invalidpass");
        dob.sendKeys("01-01-2000");

        submitButton.click();

        // Verify that the login fails and remains on the login page
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertEquals("Incorrect credentials.", errorMessage.getText());
    }

    @Test
    public void testQ1Page() {
        // Navigate to q1 page
        driver.get("http://localhost:8080/q1");

        // Find number1, number2, and result fields, and submit button
        WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid values
        number1.sendKeys("10");
        number2.sendKeys("5");
        result.sendKeys("15");

        // Click on submit button
        submitButton.click();

        // Verify redirection to q2 page
        Assert.assertTrue(driver.getCurrentUrl().contains("/q2"));
    }

    @Test
    public void testQ1PageInvalidResult() {
        // Navigate to q1 page
        driver.get("http://localhost:8080/q1");

        // Find number1, number2, and result fields, and submit button
        WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid values for number1 and number2, but an invalid result
        number1.sendKeys("10");
        number2.sendKeys("5");
        result.sendKeys("20");

        // Click on submit button
        submitButton.click();

        // Verify that the user stays on the q1 page due to incorrect result
        Assert.assertTrue(driver.getCurrentUrl().contains("/q1"));
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertEquals("Wrong answer, try again.", errorMessage.getText());
    }

    @Test
    public void testQ2Page() {
        // Navigate to q2 page
        driver.get("http://localhost:8080/q2");

        // Find number1, number2, and result fields, and submit button
        WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid values
        number1.sendKeys("10");
        number2.sendKeys("5");
        result.sendKeys("5");

        // Click on submit button
        submitButton.click();

        // Verify redirection to q3 page
        Assert.assertTrue(driver.getCurrentUrl().contains("/q3"));
    }

    @Test
    public void testQ2PageInvalidResult() {
        // Navigate to q2 page
        driver.get("http://localhost:8080/q2");

        // Find number1, number2, and result fields, and submit button
        WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid values for number1 and number2, but an invalid result
        number1.sendKeys("10");
        number2.sendKeys("5");
        result.sendKeys("20");

        // Click on submit button
        submitButton.click();

        // Verify that the user stays on the q2 page due to incorrect result
        Assert.assertTrue(driver.getCurrentUrl().contains("/q2"));
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertEquals("Wrong answer, try again.", errorMessage.getText());
    }

    @Test
    public void testQ3Page() {
        // Navigate to q3 page
        driver.get("http://localhost:8080/q3");

        // Find number1, number2, and result fields, and submit button
        WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid values
        number1.sendKeys("2");
        number2.sendKeys("3");
        result.sendKeys("6");

        // Click on submit button
        submitButton.click();

        // Verify redirection to q4 page
        Assert.assertTrue(driver.getCurrentUrl().contains("/q4"));
    }

    @Test
    public void testQ3PageInvalidResult() {
        // Navigate to q3 page
        driver.get("http://localhost:8080/q3");

        // Find number1, number2, and result fields, and submit button
        WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // Enter valid values for number1 and number2, but an invalid result
        number1.sendKeys("2");
        number2.sendKeys("3");
        result.sendKeys("10"); // Invalid result

        // Click on submit button
        submitButton.click();

        // Verify that the user stays on the q3 page due to incorrect result
        Assert.assertTrue(driver.getCurrentUrl().contains("/q3"));
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertEquals("Wrong answer, try again.", errorMessage.getText());
    }
}