package com.foundersc.ifc.base.au.impl;

import com.foundersc.ifc.FwyxImplTest;
import com.foundersc.ifc.base.au.model.Role;
import com.foundersc.ifc.base.au.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/24
 * @Time 9:21
 * @Desc
 */
@Slf4j
public class RoleServiceTest extends FwyxImplTest {

    @Autowired
    IRoleService roleService;

    @Test
    public void testQueryRoleList() throws Exception {
        List<Role> roles = roleService.queryRoleList();
        log.info("角色列表：{}", roles.toString());
    }
}