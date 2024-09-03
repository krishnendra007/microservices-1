package com.contact.repositroy;

import com.contact.model.Contact;

import java.util.List;

public interface ContactRepository {

    public List<Contact> getContacts(int id);
}
