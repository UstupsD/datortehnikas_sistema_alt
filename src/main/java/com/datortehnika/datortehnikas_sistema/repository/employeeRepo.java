package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// Repository used for query methods.
public interface employeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
