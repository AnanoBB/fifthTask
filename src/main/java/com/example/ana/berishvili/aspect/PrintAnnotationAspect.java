package com.example.ana.berishvili.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(nika.abesalashvili.davaleba5.nika_abesalashvili_davaleba_5.aspect.Println)")
    public void advice(JoinPoint joinPoint) {
        System.out.println("მეთოდისთვის გადაცემული არგუმენტები: " + Arrays.toString(joinPoint.getArgs()));
    }
}
