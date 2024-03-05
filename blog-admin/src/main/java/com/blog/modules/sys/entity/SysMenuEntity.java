package com.blog.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
@TableName("sys_menu")
public class SysMenuEntity extends Model<SysMenuEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
    @TableId
    private Integer menuId;

    /**
     * 父菜单id
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单路径
     */
    private String url;

    /**
     * 菜单类型名称
     */
    private String typeName;

    /**
     * 授权（多个用逗号分隔，如：user:lcommentt,user:create）
     */
    private String perms;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 组件名称
     */
    private String componentName;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 重定向地址
     */
    private String redirect;

    /**
     * 是否隐藏
     */
    private String show;

    /**
     * 是否缓存
     */
    private String cache;

    /**
     * 是否禁用
     */
    private String disabled;

    /**
     * 创建时间
     */
    private LocalDateTime insertTime;

    /**
     * 创建者
     */
    private String insertOperator;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新者
     */
    private String updateOperator;

    /**
     * 删除标记：0-未删除，1-已删除
     */
    private String delFlag;


    @Override
    protected Serializable pkVal() {
        return this.menuId;
    }

}
