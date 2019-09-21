package com.kennie.controller;

import com.kennie.entities.Dept;
import com.kennie.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptFeignController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/feignConsumer/get/{id}")
    public Dept get(@PathVariable("id") String id){
        return this.deptClientService.get(id);
    }
}
