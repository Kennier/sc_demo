package com.kennie.dept.serviceImp;

import com.kennie.dept.dao.DeptDao;
import com.kennie.dept.entities.Dept;
import com.kennie.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    private DeptDao dao;
    @Override
    public Dept findById(String id) {
        return dao.findById(id);
    }
}
