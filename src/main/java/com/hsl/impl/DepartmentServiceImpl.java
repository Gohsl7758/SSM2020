package com.hsl.impl;

import com.hsl.dao.DepartmentMapper;
import com.hsl.model.Department;
import com.hsl.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int addDepartment(Department department) {
        departmentMapper.insert(department);
        return 0;
    }

    @Override
    public int deleteAllDepartment() {
        departmentMapper.deleteAllDepartment();
        return 0;
    }
}
