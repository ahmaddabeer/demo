# 📱 WhatsApp Chatbot Simulation (Spring Boot)

A simple backend simulation of a WhatsApp chatbot built using **Java** and **Spring Boot**. This project was created as part of an internship assignment to demonstrate REST API handling, webhook integration, and basic chatbot logic.

---

## 🛠️ Features

* 🔗 **Webhook Endpoint**
  Accepts `POST` requests at `/webhook`

* 🤖 **Predefined Replies**

  * `Hi` → `Hello`
  * `Bye` → `Goodbye`




---

## 💻 Project Structure

### 1️⃣ Request Model — `MessageRequest.java`

```java
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

```

---

### 2️⃣ Controller — `Controller.java`

```java
package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    

    @PostMapping("/webhook")
    public String handleMessage(@RequestBody MessageRequest request) {
    // 1. Log the message
    System.out.println("Received from " + request.getSender() + ": " + request.getText());

    // 2. Predefined Logic
    String message = request.getText().toLowerCase();
    if (message.contains("Hi")) {
        return "Hello";
    } else if (message.contains("Bye")) {
        return "Goodbye";
    } else {
        return "";
    }
}

    
}```


```
---

### 3️⃣ Main — `DemoApplication.java`

```java

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);	
	}

}






## 🚀 How to Run Locally

### 📥 Clone the Repository

```bash
git clone https://github.com/ahmaddabeer/demo.git

```

---


---

## 🧪 API Testing

Use **Postman** or any API testing tool:

* **Method:** POST
* **URL:** `http://localhost:8080/webhook`

### 📤 Request Body

```json
{
  "sender": "John",
  "message": "Hi"
}
```

### 📥 Response

```
  Helo

```

---

## 🎥 Demo

* 🎬 Video Demo: *(https://drive.google.com/drive/folders/1UPmKnDyK2bp5F-UItc1-OtkDaodwmoDx?usp=sharing)*



---



## 👨‍💻 Author

**Dabeer Ahmad**
📧 (ahmaddabeer36@gmail.com)
📍 ( Prayagraj )

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---
