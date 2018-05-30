package com.shenrong.ssm.mybatis.dao;

import com.shenrong.ssm.mybatis.entity.Role;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/5/30 20:31
 */
public interface RoleMapper {
    void insertRole(Role role);

    void updateRole(Role role);

    Role getRole(long id);

    void deleteRole(long id);
}
