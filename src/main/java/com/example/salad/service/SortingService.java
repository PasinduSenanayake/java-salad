package com.example.salad.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SortingService {

    public List<Integer> sortIntegers(Collection<Integer> integerCollection){
        return integerCollection.stream().sorted().collect(Collectors.toList());
    }
}
