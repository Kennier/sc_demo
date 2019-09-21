package com.kennie.serviceImp;

import com.kennie.dao.DeptDao;
import com.kennie.entities.Dept;
import com.kennie.service.DeptService;
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
