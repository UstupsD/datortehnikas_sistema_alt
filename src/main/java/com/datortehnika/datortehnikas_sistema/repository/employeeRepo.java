package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<Employee, Long> {

}
