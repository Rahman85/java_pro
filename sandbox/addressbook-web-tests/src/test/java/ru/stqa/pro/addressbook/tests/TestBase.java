package ru.stqa.pro.addressbook.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pro.addressbook.appmanager.ApplicationMansger;

public class TestBase {

  public static final ApplicationMansger app = new ApplicationMansger(BrowserType.CHROME);
  ChromeDriver wd;

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }

}
