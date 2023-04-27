package com.employeeRest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employeeRest.models.EmployeeData;

public interface Employeerepo extends MongoRepository<EmployeeData, String> {

}
