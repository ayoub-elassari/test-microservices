package com.example.departementservice.service;

import com.example.departementservice.entity.Department;
import com.example.departementservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentID) {
        log.info("inside findDepartmentById of DepartmentService");
        return departmentRepository.findById(departmentID).get() ;
    }
}
