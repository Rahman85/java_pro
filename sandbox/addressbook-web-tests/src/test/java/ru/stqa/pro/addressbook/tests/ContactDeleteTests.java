package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.ContactData;

public class ContactDeleteTests extends TestBase {
  @Test(enabled = false)
  public void testContactDeletion() {
    app.goTo().gotoHomePage();
    if (!app.group().isThereAContact()) {
      app.group().createContact(new ContactData("Timur", "Mergenov", "null"));

    }
    app.group().initContactModification();
    app.group().deleteContactForm();

  }
}
