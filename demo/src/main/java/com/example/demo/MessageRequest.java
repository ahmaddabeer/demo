package com.example.demo;

public class MessageRequest {
    private String sender;
    private String text;

    // Standard Getters and Setters are REQUIRED for Spring to read the JSON
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
