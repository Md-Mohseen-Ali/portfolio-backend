package com.portfolio.contact.controller;

import com.portfolio.contact.model.Contact;
import com.portfolio.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")

public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping
    public String saveContact(@RequestBody Contact contact) {

        repository.save(contact);   
        return "Saved to database!";
    }
}