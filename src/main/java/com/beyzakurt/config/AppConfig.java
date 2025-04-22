package com.beyzakurt.config;

import com.beyzakurt.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Enes", "Bayram"));
        employeeList.add(new Employee(2, "Deniz", "Demir"));
        employeeList.add(new Employee(3, "Akif", "Kara"));
        return employeeList;
    }


}
