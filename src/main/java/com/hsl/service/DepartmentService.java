package com.hsl.service;

import com.hsl.model.Department;

import java.util.List;

public interface DepartmentService {
    int addDepartment(Department department);
    int deleteAllDepartment();
    Department selectDepByName(String depname);
    int alertDep(Department department);
    List<Department> showAllDep();
}
