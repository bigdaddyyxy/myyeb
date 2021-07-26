package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.Department;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yxy
 * @since 2021-06-16
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> getAllDepartments(@Param("parentId") Integer parentId);

    //添加部门
    void addDep(Department department);

    //删除部门
    void deleteDep(Department department);
}
