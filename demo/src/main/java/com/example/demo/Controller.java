package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    

    @PostMapping("/webhook")
    public String handleMessage(@RequestBody MessageRequest request) {
    // 1. Log the message
     // Safety check: if text is missing, don't crash
    if (request.getText() == null) {
        System.out.println("Received a request with no text!");
        return "Please send some text.";
    }

    // 2. Predefined Logic
    String message = request.getText().toLowerCase();
    if (message.contains("hi")) {
        return "Hello";
    } else if (message.contains("bye")) {
        return "Goodbye";
    } else {
        return "Work on process";
    }
}

    
}
