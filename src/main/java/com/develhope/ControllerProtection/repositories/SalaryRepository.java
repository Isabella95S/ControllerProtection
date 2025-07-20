package com.develhope.ControllerProtection.repositories;

import com.develhope.ControllerProtection.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {
}
