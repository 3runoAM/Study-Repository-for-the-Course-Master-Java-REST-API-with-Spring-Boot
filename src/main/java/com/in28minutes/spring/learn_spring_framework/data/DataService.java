package com.in28minutes.spring.learn_spring_framework.data;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    public List<Integer> getData() {
        return List.of(456, 654, 54);
    }
}
