package com.qym.service;

import com.qym.entites.Dept;

import java.util.List;

/**
 * @Auther: qiuyuming
 * @Date: 2019/3/28 09:57
 * @Description:
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
