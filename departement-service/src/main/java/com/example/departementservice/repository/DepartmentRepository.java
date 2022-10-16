package com.example.departementservice.repository;

import com.example.departementservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    Department findDepartmentById(Long );
}
