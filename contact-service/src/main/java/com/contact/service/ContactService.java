package com.contact.service;

import com.contact.model.Contact;
import com.contact.repositroy.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService implements ContactRepository {
    List<Contact> list = List.of(
            new Contact(1,"Rahul","Rahul.gmail.com",101),
            new Contact(2,"Shyam","Shyam.gmail.com",101),
            new Contact(3,"Manoj","Manoj.gmail.com",102),
            new Contact(1,"Sakshi","Sakshi.gmail.com",103)
    );
    public List<Contact> getContacts(int id) {
        return list.stream().filter(contact -> contact.getUserId()==id).collect(Collectors.toList());
    }
}
