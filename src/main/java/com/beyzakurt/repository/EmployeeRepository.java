package com.beyzakurt.repository;

import com.beyzakurt.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getEmployees() {

        return employeeList;
    }
    
    public Employee getEmployeeById(int id) {
        Employee findEmployee = null;

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                findEmployee = employee;
                break;
            }
        }
        return findEmployee;
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
        List<Employee> employeeWithParams = new ArrayList<>();
        if(firstName == null && lastName == null) {
            return employeeList;
        }
        return employeeWithParams;
    }

    public Employee saveEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
        return newEmployee;
    }

    public boolean deleteEmployee(int id) {
        Employee deleteEmployee = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                deleteEmployee = employee;
                break;
            }
        }
        if (deleteEmployee == null) {
            return false;
        }
        employeeList.remove(deleteEmployee);
        return true;
    }

    public Employee findEmployeeById(int id) {
        Employee findEmployee = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                findEmployee = employee;
                break;
            }
        }
        return findEmployee;
    }

    public Employee updateEmployee(int id, Employee request) {
        Employee findEmployee = findEmployeeById(id);
        if (findEmployee != null) {
            deleteEmployee(id);

            Employee updatedEmployee = new Employee();
            updatedEmployee.setId(id);
            updatedEmployee.setFirstName(request.getFirstName());
            updatedEmployee.setLastName(request.getLastName());
            employeeList.add(updatedEmployee);

            return updatedEmployee;
        }
        return null;
    }

}
