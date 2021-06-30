package com.example.ana.berishvili.service.imple;

import com.example.ana.berishvili.aspect.Println;
import com.example.ana.berishvili.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Println
    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }

}
