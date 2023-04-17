package com.kgisl.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.SpringBootCrud.Model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}