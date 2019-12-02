package tn.numeryx.service;

import org.springframework.stereotype.Service;
import tn.numeryx.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


    public List<Employee> getAllEmployee() {
        System.out.println("from getAllEmployee");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        return employees;
    }


    public Employee getEmployeeById() {
        System.out.println("from getEmployee");

        return new Employee();
    }



    public void createEmployee() {
        System.out.println("from createEmployee");
    }
}
