package ru.stqa.pro.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationMansger {
  WebDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private String browser;


  public ApplicationMansger(String browser) {
    this.browser = browser;
  }


  public void init() {
    if (browser.equals(BrowserType.CHROME)) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\hajee\\Desktop\\chromedriver_win32\\chromedriver.exe");
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    } else if (browser.equals(BrowserType.IE)) {
      System.setProperty("webdriver.ie.driver", "C:\\Users\\hajee\\Desktop\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");

      wd = new InternetExplorerDriver();
    }
    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.Login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
