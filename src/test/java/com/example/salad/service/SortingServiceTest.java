package com.example.salad.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class SortingServiceTest {

    private SortingService sortingService;

    @BeforeEach
    public void setup() {
        sortingService = new SortingService();
    }

    @Test
    public void test_sort_integers() {

        Assertions.assertEquals(Arrays.asList(1, 2,3), sortingService.sortIntegers(Arrays.asList(3, 2, 1)));
    }

}
