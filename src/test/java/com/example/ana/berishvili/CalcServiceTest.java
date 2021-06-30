package com.example.ana.berishvili;

import com.example.ana.berishvili.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest() {
        int expected = 72;
        int actual;
        actual = calculatorService.multiplication(8, 9);
        assertEquals(expected, actual);
    }




