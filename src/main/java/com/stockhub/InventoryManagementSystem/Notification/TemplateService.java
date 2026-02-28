package com.stockhub.InventoryManagementSystem.Service.utilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class TemplateService {

    @Autowired
    private TemplateEngine templateEngine;

    public String processTemplate(String templateName, Context context) {
        return templateEngine.process(templateName, context);
    }
}