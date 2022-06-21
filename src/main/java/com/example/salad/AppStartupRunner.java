package com.example.salad;

import com.example.salad.service.ComparisonService;
import com.example.salad.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AppStartupRunner implements ApplicationRunner {

    @Autowired
    ComparisonService comparisonService;

    @Autowired
    SortingService sortingService;


    @Override
    public void run(ApplicationArguments args) {
      int max =  comparisonService.getMax(1,2);
      int min =  comparisonService.getMin(1,2);
      List<Integer> sortedIntegerList = sortingService.sortIntegers(Arrays.asList(3,2,1));
      System.out.println("max value: "+max);
      System.out.println("min value: "+min);
      System.out.println("sorted values: "+sortedIntegerList);
    }
}
