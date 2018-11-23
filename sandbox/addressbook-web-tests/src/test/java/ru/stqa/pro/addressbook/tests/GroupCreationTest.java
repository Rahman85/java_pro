package ru.stqa.pro.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("tree1", null, "red3"));
  }

}
