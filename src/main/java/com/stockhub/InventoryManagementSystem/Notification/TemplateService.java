package com.stockhub.InventoryManagementSystem.Notification;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service

public class TemplateService {
    private final TemplateEngine templateEngine;
    public TemplateService (TemplateEngine templateEngine){
        this.templateEngine = templateEngine ;
    }
    public String buildRegistrationEmail(String name) {
        Context context = new Context();
        context.setVariable("name", name);

        return templateEngine.process("Registration successfully", context);
    }

}
