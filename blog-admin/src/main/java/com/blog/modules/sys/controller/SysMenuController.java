package com.blog.modules.sys.controller;


import com.blog.modules.sys.entity.SysMenuEntity;
import com.blog.modules.sys.service.SysMenuService;
import com.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
@RestController
@RequestMapping("/admin/menu")
public class SysMenuController {

    @Autowired
    SysMenuService sysMenuService;

    // 获取菜单列表
    // 获取菜单类型列表
    // 添加菜单
    // 编辑菜单

    //删除菜单
    // @SysLog("删除菜单")
    @PostMapping("/delete/{menuId}")
    @RequiresPermissions("sys:menu:delete")
    @RequestMapping("/menu/delete/{id}")
    public R deleteMenu(Long id) {
        sysMenuService.delete(id);
        return R.ok();
    }


    // 菜单详情
    @GetMapping("/info/{id}")
    public R getInfo(@PathVariable("id") Long id) {
        SysMenuEntity sysMenuEntity = sysMenuService.getById(id);
        return new R().put("SysMenuEntity",sysMenuEntity);
    }
}
