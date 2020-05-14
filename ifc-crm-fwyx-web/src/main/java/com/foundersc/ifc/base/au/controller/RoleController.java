package com.foundersc.ifc.base.au.controller;

import com.foundersc.ifc.base.au.model.Role;
import com.foundersc.ifc.base.au.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/23
 * @Time 17:13
 * @Desc
 */
@RestController
@RequestMapping(value = "/role")
@Api(tags = "角色")
public class RoleController {

    @Autowired
    IRoleService roleService;

    @ApiOperation(value = "获取角色列表")
    @RequestMapping(value = "/getRoles", method = RequestMethod.GET)
    public List<Role> getRoles(){
        List<Role> roles = roleService.queryRoleList();
        return roles;

    }


}
