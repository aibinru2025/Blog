package com.blog.modules.sys.service;

import com.blog.modules.sys.entity.SysMenuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
public interface SysMenuService extends IService<SysMenuEntity> {
    // 获取菜单列表
    // 获取菜单类型列表
    // 添加菜单
    // 编辑菜单

    /**
     * 根据父菜单，查询子菜单
     * @param parentId
     * @return
     */
    public List<SysMenuEntity> queryListParentId(Long parentId);

    /**
     * 删除菜单
     * @param menuId
     */
    public void delete(Long menuId);

}
