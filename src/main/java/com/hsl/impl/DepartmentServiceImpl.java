package com.hsl.impl;

import com.hsl.dao.DepartmentMapper;
import com.hsl.model.Department;
import com.hsl.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int addDepartment(Department department) {
        departmentMapper.insert(department);
        return 1;
    }

    @Override
    public int deleteAllDepartment() {
        departmentMapper.deleteAllDepartment();
        return 1;
    }

    @Override
    public Department selectDepById(int depid) {
        return departmentMapper.selectByPrimaryKey(depid);
    }

    @Override
    public int alertDep(Department department) {

        return departmentMapper.updateByPrimaryKey(department);
    }

    @Override
    public List<Department> showAllDep() {
        List<Department> list=departmentMapper.selectAllDep();
        return list;
    }
}
