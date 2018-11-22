package ru.stqa.pro.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("tree1", "red2", "red3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
