package com.stockhub.InventoryManagementSystem.Notification;

import com.stockhub.InventoryManagementSystem.Enities.Customer;
import com.stockhub.InventoryManagementSystem.Enities.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification {

    Invitation invite ;
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String senderMail;

    @Autowired
    private TemplateService templateService ;
//    private static final String REGISTRATION_SUCCESS_SUBJECT =
//            "INVENTORY MANAGEMENT HUB REGISTRATION";

    public void sendMail(String email ,String obj){
        SimpleMailMessage message = new SimpleMailMessage();
        String emailContent =
                templateService.buildRegistrationEmail(email);

        message.setFrom(senderMail);
        message.setTo();
        message.setText(emailContent);
        message.setSubject(obj);
        javaMailSender.send(message);
        System.out.println("Message sent successfully");
    }
}