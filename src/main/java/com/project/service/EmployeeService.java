package com.project.service;

import com.project.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee saveEmployee(Employee employee);

    void deleteById(int id);
}
