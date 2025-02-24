package com.portfolio.controller;

import com.portfolio.model.Contact;
import com.portfolio.repository.ContactRepository;
import com.portfolio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
    public ResponseEntity<?> submitContact(@RequestBody Contact contact) {
        contact.setTimestamp(LocalDateTime.now());
        contactRepository.save(contact);

        // Send email notification
        emailService.sendEmail(
            "amitv28242@gmail.com",
            "New Portfolio Contact Form Submission",
            "Name: " + contact.getName() + "\nEmail: " + contact.getEmail() + "\nMessage: " + contact.getMessage()
        );

        return ResponseEntity.ok().build();
    }
}
