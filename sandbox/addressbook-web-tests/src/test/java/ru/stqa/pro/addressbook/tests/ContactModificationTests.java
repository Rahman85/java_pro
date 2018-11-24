package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    app.getNavigationHelper().gotoHomePage();
    if (! app.getGroupHelper().isThereAContact()) {
      app.getGroupHelper().createContact(new ContactData("Timur", "Mergenov", "null"));

    }
    app.getGroupHelper().initContactModification();
    app.getGroupHelper().fillContactForm(new ContactData("Alex", "Super", "null"), false);
    app.getGroupHelper().updateContactForm();


  }

}
