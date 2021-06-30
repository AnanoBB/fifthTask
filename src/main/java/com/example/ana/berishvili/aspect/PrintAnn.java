package com.example.ana.berishvili.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;




@Aspect
@Component
public class PrintAnn {
    @Before("@annotation(com.example.ana.berishvili.aspect.Println)")
    public void advice(JoinPoint joinPoint) {
        System.out.println("გადაცემული არგუმენტები: " + Arrays.toString(joinPoint.getArgs()));
    }
}
