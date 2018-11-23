package ru.stqa.pro.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastnsme;
  private String group;

  public ContactData(String firstname, String lastnsme,String group) {
    this.firstname = firstname;
    this.lastnsme = lastnsme;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastnsme() {
    return lastnsme;
  }

  public String getGroup() {
    return group;
  }
}
