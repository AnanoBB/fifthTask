package com.example.ana.berishvili.service.imple;

import com.example.ana.berishvili.aspect.Print;
import com.example.ana.berishvili.service.CalcService;
import org.springframework.stereotype.Service;



@Service
public class CalcServiceImpl implements CalcService {

    @Print
    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }
}