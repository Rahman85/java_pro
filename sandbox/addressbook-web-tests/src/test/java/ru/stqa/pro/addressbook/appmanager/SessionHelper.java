package ru.stqa.pro.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {


  public SessionHelper(WebDriver wd) {
     super(wd);
  }

  public void Login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"), password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }


}
