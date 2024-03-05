package com.blog.modules.sys.service.impl;

import com.blog.modules.sys.dao.SysRoleDao;
import com.blog.modules.sys.entity.SysRoleEntity;
import com.blog.modules.sys.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.R;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

    @Override
    public SysRoleEntity queryByRoleName(String name){
        SysRoleEntity role = baseMapper.queryByRoleName(name);
        return role;
    }

}
