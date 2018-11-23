package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initContactCreation();
    app.getGroupHelper().fillContactForm(new ContactData("Timur", "Mergenov", "tree1"), true);
    app.getGroupHelper().submitNewContact();
    app.getNavigationHelper().gotoHomePage();

  }

}



