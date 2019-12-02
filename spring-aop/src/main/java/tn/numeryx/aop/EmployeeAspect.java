package tn.numeryx.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import tn.numeryx.model.Employee;

@Aspect
@Component
public class EmployeeAspect {

    @Before("execution( * tn.numeryx.service.EmployeeService.getEmployeeById(..))")
    public void logBeforeV1(JoinPoint joinPoint) {
        System.out.println("logBeforeV1 " + joinPoint.getSignature().getName());
    }

    @Before("execution( * tn.numeryx.service.EmployeeService.*(..))")
    public void logBeforeV2(JoinPoint joinPoint) {
        System.out.println("logBeforeV2 " + joinPoint.getSignature().getName());
    }

    @After("execution( * tn.numeryx.service.EmployeeService.getEmployeeById(..))")
    public void logAfterV1(JoinPoint joinPoint) {
        System.out.println("logAfterV1 " + joinPoint.getSignature().getName());
    }

    @After("execution( * tn.numeryx.service.EmployeeService.*(..))")
    public void logAfterV2(JoinPoint joinPoint) {
        System.out.println("logAfterV2 " + joinPoint.getSignature().getName());
    }


    @Around("execution( * tn.numeryx.service.EmployeeService.getEmployeeById(..))")
    public Object logAroundV1(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("logAroundV1 " + proceedingJoinPoint.getSignature().getName());
        Employee employee = null;
        try {
            employee = (Employee) proceedingJoinPoint.proceed();
            employee.setFirstName("KHALIL");
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return employee;
    }
}
