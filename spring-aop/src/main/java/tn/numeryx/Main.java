package tn.numeryx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import tn.numeryx.config.AppConfig;
import tn.numeryx.service.EmployeeService;

public class Main {


    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        System.out.println(employeeService.getEmployeeById());

    }
}
