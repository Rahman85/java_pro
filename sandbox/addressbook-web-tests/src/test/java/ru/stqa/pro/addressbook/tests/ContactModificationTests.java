package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test (enabled = false)
  public void testContactModification() {

    app.goTo().gotoHomePage();
    if (! app.group().isThereAContact()) {
      app.group().createContact(new ContactData("Timur", "Mergenov", "null"));

    }
    app.group().initContactModification();
    app.group().fillContactForm(new ContactData("Alex", "Super", "null"), false);
    app.group().updateContactForm();


  }

}
