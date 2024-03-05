package com.blog.modules.sys.controller;


import com.blog.modules.sys.entity.SysRoleEntity;
import com.blog.modules.sys.service.SysRoleService;
import com.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import static javafx.scene.input.KeyCode.R;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
@Controller
//@RequestMapping("/admin")
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    @GetMapping("/info/{id}")
    public R getRole(@PathVariable("id") Long id) {
        SysRoleEntity sysRoleEntity = sysRoleService.getById(id);
        return new R().put("Entity", sysRoleEntity);
    }

    @GetMapping("/role/{name}")
    public R queryByUserName(@PathVariable("name") String name) {
        SysRoleEntity role = sysRoleService.queryByRoleName(name);
        return new R().put("role", role);
    }
}
