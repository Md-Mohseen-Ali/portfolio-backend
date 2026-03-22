package com.portfolio.contact.controller;

import com.portfolio.contact.model.Contact;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @PostMapping
    public String handleContact(@Valid @RequestBody Contact contact) {

        System.out.println("=== New Contact Message ===");
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Message: " + contact.getMessage());

        return "Message received successfully!";
    }
}