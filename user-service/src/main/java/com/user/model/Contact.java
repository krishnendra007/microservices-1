package com.user.model;

public class Contact {

    private  int cId;
    private String contactName;
    private String email;
    private int userId;

    public Contact() {
    }

    public Contact(int cId, String contactName, String email, int userId) {
        this.cId = cId;
        this.contactName = contactName;
        this.email = email;
        this.userId = userId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
