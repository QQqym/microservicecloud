package com.qym.dao;

import com.qym.entites.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: qiuyuming
 * @Date: 2019/3/28 09:52
 * @Description:
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
