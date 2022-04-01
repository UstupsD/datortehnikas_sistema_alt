package com.datortehnika.datortehnikas_sistema.service;

import com.datortehnika.datortehnikas_sistema.exception.employeeNotFoundException;
import com.datortehnika.datortehnikas_sistema.model.Employee;
import com.datortehnika.datortehnikas_sistema.repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class employeeService {
    private final employeeRepo employeeRepo;
    // These are all the functions for working with the employee entries in the database.
    @Autowired
    public employeeService(employeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new employeeNotFoundException("Error: User by ID " + id + " was not found!"));
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
