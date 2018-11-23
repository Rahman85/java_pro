package ru.stqa.pro.addressbook.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pro.addressbook.appmanager.ApplicationMansger;

public class TestBase {

  public final ApplicationMansger app = new ApplicationMansger(BrowserType.CHROME);
  ChromeDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
