package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IkeaTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
   // driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
     System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIKEA7() throws Exception {
    driver.get("https://www.ikea.com/");
    driver.findElement(By.linkText("Take me to IKEA United States")).click();
    driver.findElement(By.linkText("Log In/Sign Up")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hej! Log into your IKEA account.'])[1]/following::label[1]")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("silksona@hotmail.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::label[1]")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Password19");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Log In/Sign Up'])[1]/following::div[6]")).click();
    driver.findElement(By.linkText("Cooking")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(118)'])[1]/following::a[2]")).click();
    driver.findElement(By.id("imgThmbProduct6")).click();
    driver.findElement(By.cssSelector("svg.icon-component__icon.svg-icon")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Click here.'])[1]/following::img[3]")).click();
    driver.findElement(By.id("storesList")).click();
    new Select(driver.findElement(By.id("storesList"))).selectByVisibleText("IL, IKEA Schaumburg");
    driver.findElement(By.id("storesList")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='- Select a store -'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Continue'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Return to your shopping cart'])[1]/following::a[1]")).click();
    driver.findElement(By.id("invoiceAddress-street")).click();
    driver.findElement(By.id("invoiceAddress-street")).clear();
    driver.findElement(By.id("invoiceAddress-street")).sendKeys("2065 colchester avenue");
    driver.findElement(By.name("basket")).submit();
    driver.findElement(By.id("invoiceAddress-street")).clear();
    driver.findElement(By.id("invoiceAddress-street")).sendKeys("2065 Colchester Avenue");
    driver.findElement(By.id("invoiceAddress-city")).clear();
    driver.findElement(By.id("invoiceAddress-city")).sendKeys("Hoffman Estates");
    driver.findElement(By.id("invoiceAddress-zip")).clear();
    driver.findElement(By.id("invoiceAddress-zip")).sendKeys("60192");
    new Select(driver.findElement(By.id("invoiceAddress-province"))).selectByVisibleText("Illinois");
    driver.findElement(By.id("invoiceAddress-emailRepetition")).clear();
    driver.findElement(By.id("invoiceAddress-emailRepetition")).sendKeys("silksona@hotmail.com");
    driver.findElement(By.id("invoiceAddress-phoneNumbers.home")).clear();
    driver.findElement(By.id("invoiceAddress-phoneNumbers.home")).sendKeys("8475316261");
    driver.findElement(By.id("addressFormDisclaimerCheckbox")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Return to previous step'])[1]/following::input[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}




