
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@Controller
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @Autowired
    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

//    @PostMapping("/generate")
    @PostMapping(value = "/generate", consumes = "application/json", produces = "text/plain")
    public String generateEmail(@RequestBody EmailRequest emailRequest, Model model) {
    	System.out.println(emailRequest);
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        model.addAttribute("reply", response); 
        return "mail";
    }

    @GetMapping("/mail")
    public String mail(Model model) {
    	model.addAttribute("emailRequest", new EmailRequest());
        return "mail"; // Returns mail1.html from the templates folder
    }
}
