package com.example.ana.berishvili;

import com.example.ana.berishvili.service.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalcServiceTest {
    @Autowired
    CalcService calcService;


    @Test
    void multiplicationTest() {
        int expected = 20;
        int actual;
        actual = calcService.multiplication(10, 2);
        assertEquals(expected, actual);
    }
}




