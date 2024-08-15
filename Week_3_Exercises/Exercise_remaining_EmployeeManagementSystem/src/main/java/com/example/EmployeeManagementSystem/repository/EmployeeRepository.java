package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(name = "Employee.findByEmail")
    Employee findByEmailNamed(@Param("email") String email);


    @Query(name = "Employee.findByDepartmentName")
    List<Employee> findByDepartmentNameNamed(@Param("departmentName") String departmentName);
}