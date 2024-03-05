package com.blog.modules.sys.dao;

import com.blog.modules.sys.entity.SysRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.common.utils.R;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

 /**
  * 根据角色名称查询权限
  * @param name
  * @return
  */
  SysRoleEntity queryByRoleName(@Param("name") String name);
}
