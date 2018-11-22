package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pro.addressbook.appmanager.ApplicationMansger;

public class TestBase {

  protected final ApplicationMansger app = new ApplicationMansger();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
