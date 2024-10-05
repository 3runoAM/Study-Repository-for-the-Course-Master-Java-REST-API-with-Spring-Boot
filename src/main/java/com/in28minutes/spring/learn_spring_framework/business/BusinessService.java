package com.in28minutes.spring.learn_spring_framework.business;

import com.in28minutes.spring.learn_spring_framework.data.DataService;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    private final DataService dataService;

    BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public long calculateValue() {
        return dataService.getData().stream()
                .mapToLong(Integer::longValue)
                .sum();
    }
}
