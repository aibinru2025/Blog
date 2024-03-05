package com.blog.modules.sys.service.impl;

import com.blog.modules.sys.entity.SysMenuEntity;
import com.blog.modules.sys.dao.SysMenuDao;
import com.blog.modules.sys.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.modules.sys.service.SysRoleMenuService;
import com.common.utils.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

    @Autowired
    SysRoleMenuService sysRoleMenuService;

    // 获取菜单列表
    // 获取菜单类型列表
    // 添加菜单
    // 编辑菜单

    /**
     * 根据父菜单，查询子菜单
     * @param parentId 父菜单ID
     */
    @Override
    public List<SysMenuEntity> queryListParentId(Long parentId){
        return null;
    }

    /**
     * 删除菜单
     */
    @Override
    public void delete(Long menuId){
        this.removeById(menuId);
        sysRoleMenuService.removeByMap(new MapUtils().put("menu_id", menuId));
    }
}
