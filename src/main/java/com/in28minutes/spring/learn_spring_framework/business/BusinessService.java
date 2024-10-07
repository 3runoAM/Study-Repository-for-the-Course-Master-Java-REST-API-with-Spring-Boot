package com.in28minutes.spring.learn_spring_framework.business;

import com.in28minutes.spring.learn_spring_framework.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
//    @Autowired
    private final DataService dataService;

    @Autowired
    BusinessService(DataService dataService) {
        System.out.println("CONSTRUCTOR INJECTION");
        this.dataService = dataService;
    }

//    @Autowired
//    public void setDataService(DataService dataService) {
//        System.out.println("SETTER INJECTION");
//        this.dataService = dataService;
//    }

    public long calculateValue() {
        return dataService.getData().stream()
                .mapToLong(Integer::longValue)
                .sum();
    }
}
