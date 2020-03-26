package com.foundersc.ifc.base.au.impl;

import com.foundersc.ifc.base.au.model.Role;
import com.foundersc.ifc.base.au.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Arrays;
import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/23
 * @Time 16:28
 * @Desc
 */
@Service
public class RoleService implements IRoleService{

    @Override
    public List<Role> queryRoleList() {
        return Arrays.asList(
                new Role("100", "角色1"),
                new Role("101", "角色2"),
                new Role("102", "角色3")
        );
    }
}
