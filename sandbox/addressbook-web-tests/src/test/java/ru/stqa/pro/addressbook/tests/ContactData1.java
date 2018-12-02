package ru.stqa.pro.addressbook.tests;

public class ContactData1 {
    private final String firstname;
    private final String lastname;
    private final String homephone;
    private final String mobile;
    private final String work;
    private final String email;

    public ContactData1(String firstname, String lastname, String homephone, String mobile, String work, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homephone = homephone;
        this.mobile = mobile;
        this.work = work;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHomephone() {
        return homephone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getEmail() {
        return email;
    }
}
