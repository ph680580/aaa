package com.ph.vuelx02.dao;

import com.ph.vuelx02.entity.Department;
import com.ph.vuelx02.vo.DepartmentNode;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<DepartmentNode> selectChildren(Integer departmentId);
}