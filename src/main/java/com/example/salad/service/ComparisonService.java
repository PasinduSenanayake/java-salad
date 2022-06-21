package com.example.salad.service;

import org.springframework.stereotype.Service;

import static com.example.salad.util.Helper.isGreaterThan;

@Service
public class ComparisonService {

    public int getMax(int integer1, int integer2){
        if(isGreaterThan(integer1,integer2)){
            return integer1;
        }
        return integer2;
    }

    public int getMin(int integer1, int integer2){
       return Math.min(integer1,integer2);
    }
}
