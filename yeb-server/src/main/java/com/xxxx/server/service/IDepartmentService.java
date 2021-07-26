package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Department;
import com.xxxx.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yxy
 * @since 2021-06-16
 */
public interface IDepartmentService extends IService<Department> {

    //获取所有部门
    List<Department> getAllDepartments();

    RespBean addDep(Department department);

    //删除部门
    RespBean deleteDep(Integer id);

}
