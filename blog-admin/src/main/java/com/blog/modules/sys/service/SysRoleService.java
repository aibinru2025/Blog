package com.blog.modules.sys.service;

import com.blog.modules.sys.entity.SysRoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.R;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    /**
     * 根据角色名查询
     * @param name
     * @return
     */
    SysRoleEntity queryByRoleName(String name);
}
