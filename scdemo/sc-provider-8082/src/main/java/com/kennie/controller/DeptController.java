package com.kennie.controller;

import com.kennie.entities.Dept;
import com.kennie.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/getDeptById/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") String id){
        System.out.println("xixi");
        return deptService.findById(id);
    }
}
