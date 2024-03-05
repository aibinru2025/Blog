package com.blog.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author aibinru
 * @since 2024-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_role")
public class SysRoleEntity extends Model<SysRoleEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色权限组
     */
    private String permissions;

    /**
     * 是否禁用
     */
    private Boolean disabled;

    /**
     * 角色描述
     */
    private String description;


    @Override
    protected Serializable pkVal() {
        return this.name;
    }

}
