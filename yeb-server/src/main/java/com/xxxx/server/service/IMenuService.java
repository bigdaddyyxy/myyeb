package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yxy
 * @since 2021-06-16
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getMenusByAdminId();

    //根据角色获取菜单列表
    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
