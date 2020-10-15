package com.hsl.service;

import com.hsl.model.Department;

import java.util.List;

public interface DepartmentService {
    int addDepartment(Department department);
    int deleteAllDepartment();
    Department selectDepById(int depid);
    int alertDep(Department department);
    List<Department> showAllDep();
}
