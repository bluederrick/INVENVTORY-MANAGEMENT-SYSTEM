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
    private static final String REGISTRATION_SUCCESS_SUBJECT =
            "Welcome to StaffPro Employment Hub";

    public void sendMail(Customer customer){
        SimpleMailMessage message = new SimpleMailMessage();
        String emailContent =
                templateService.buildRegistrationEmail(invite.getEmail());

        message.setFrom(senderMail);
        message.setTo();
        message.setText(emailContent);
        message.setSubject(REGISTRATION_SUCCESS_SUBJECT);
        javaMailSender.send(message);
        System.out.println("Message sent successfully");

    }
}