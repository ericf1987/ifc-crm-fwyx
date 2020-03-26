package com.foundersc.ifc.base.au.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author fengye
 * @Date 2020/3/23
 * @Time 16:11
 * @Desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    private String roleId;
    private String roleName;

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
