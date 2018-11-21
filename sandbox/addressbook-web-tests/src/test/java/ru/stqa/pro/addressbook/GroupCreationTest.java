package ru.stqa.pro.addressbook;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("tree1", "red2", "red3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
