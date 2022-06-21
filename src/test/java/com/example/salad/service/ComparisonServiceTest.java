package com.example.salad.service;

import com.example.salad.util.Helper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Helper.class})
public class ComparisonServiceTest {

    private ComparisonService comparisonService;

    @Before
    public void setup() {
        comparisonService = new ComparisonService();
    }


    @Test
    public void test_get_mex() {

        mockStatic(Helper.class);

        when(Helper.isGreaterThan(anyInt(),anyInt())).thenReturn(true);

        Assert.assertEquals(2,comparisonService.getMax(2,1));

    }

    @Test
    public void test_get_min() {

        Assert.assertEquals(1,comparisonService.getMin(2,1));

    }

}
