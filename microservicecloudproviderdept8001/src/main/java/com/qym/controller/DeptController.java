package com.qym.controller;

import com.qym.entites.Dept;
import com.qym.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: qiuyuming
 * @Date: 2019/3/28 10:01
 * @Description:
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;


    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept)
    {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list()
    {
        return service.list();
    }



}
