package ru.stqa.pro.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pro.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testsGroupDeletion() {

        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("tree1", null, "red3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
