package com.employeeFlux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.employeeFlux.models.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
