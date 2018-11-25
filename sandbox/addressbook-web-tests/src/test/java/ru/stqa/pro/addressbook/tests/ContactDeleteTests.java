package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.ContactData;

public class ContactDeleteTests extends TestBase {
  @Test(enabled = false)
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getGroupHelper().isThereAContact()) {
      app.getGroupHelper().createContact(new ContactData("Timur", "Mergenov", "null"));

    }
    app.getGroupHelper().initContactModification();
    app.getGroupHelper().deleteContactForm();

  }
}
