package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getGroupHelper().initContactModification();
    app.getGroupHelper().fillContactForm(new ContactData("Timur1", "Mergenov1", null), false);
    app.getGroupHelper().updateContactForm();

  }

}
