package com.kennie.service;

import com.kennie.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SC-PROVIDER")
public interface DeptClientService {
    @RequestMapping("/getDeptById/{id}")
    public Dept get(@PathVariable("id") String id);
}
