package com.wishfyTech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wishfyTech.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
