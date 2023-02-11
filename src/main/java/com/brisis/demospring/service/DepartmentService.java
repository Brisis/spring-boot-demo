package com.brisis.demospring.service;

import com.brisis.demospring.entity.Department;
import com.brisis.demospring.exception.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getDepartmentList();

    public Department getDepartmentById(Long departmentId) throws DepartmentNotFound;

    public void deleteDepartment(Long departmentId);

    public Department updateDepartment(Department department, Long departmentId);

    public Department getDepartmentByName(String departmentName);
}
