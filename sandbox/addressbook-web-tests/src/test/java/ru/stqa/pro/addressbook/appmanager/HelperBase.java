package ru.stqa.pro.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
  protected ChromeDriver wd;

  public HelperBase(ChromeDriver wd) {
    this.wd = wd;
  }

  protected void click(By Locator) {
    wd.findElement(Locator).click();
  }

  protected void type(By Locator, String text) {
    click(Locator);
    wd.findElement(Locator).clear();
    wd.findElement(Locator).sendKeys(text);
  }
  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
