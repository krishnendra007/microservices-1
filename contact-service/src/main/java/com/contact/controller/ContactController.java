package com.contact.controller;

import com.contact.model.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts/user")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping("/{id}")
    List<Contact> getContacts(@PathVariable int id){
        return service.getContacts(id);
    }

}
