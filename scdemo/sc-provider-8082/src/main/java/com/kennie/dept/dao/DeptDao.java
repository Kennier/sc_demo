package com.kennie.dept.dao;

import com.kennie.dept.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DeptDao
{
    Dept findById(String id);
}
