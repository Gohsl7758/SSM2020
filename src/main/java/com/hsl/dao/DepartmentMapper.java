package com.hsl.dao;

import com.hsl.model.Department;
import com.hsl.model.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer depid);
    int deleteAllDepartment();

    int insert(Department record);

    int insertSelective(int record);

    List<Department> selectByExample(DepartmentExample example);

    List<Department> selectAllDep();


    Department selectByPrimaryKey(Integer depid);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}