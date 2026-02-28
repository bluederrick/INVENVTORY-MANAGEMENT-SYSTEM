package com.stockhub.InventoryManagementSystem.Notification;

import com.stockhub.InventoryManagementSystem.service.utilService.TemplateService;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

@Service
public class EmailNotification {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private TemplateService templateService;

    @Value("${spring.mail.username}")
    private String senderMail;

    public void sendOtpMail(String email, String otp) {

        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper =
                    new MimeMessageHelper(message, true);

            Context context = new Context();
//            context.setVariable("name", name);
            context.setVariable("otp", otp);

            String htmlContent =
                    templateService.processTemplate("otp-email", context);

            helper.setFrom(senderMail);
            helper.setTo(email);
            helper.setSubject("Your OTP Code");
            helper.setText(htmlContent, true); // true = HTML

            javaMailSender.send(message);

            System.out.println("OTP Email sent successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}