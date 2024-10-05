package com.in28minutes.spring.learn_spring_framework.web;

import com.in28minutes.spring.learn_spring_framework.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    private final BusinessService businessService;

    public WebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateValue();
    }
}