package com.foundersc.ifc.base.au.controller;

import com.foundersc.ifc.base.au.model.Role;
import com.foundersc.ifc.base.au.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/23
 * @Time 17:13
 * @Desc
 */
@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    IRoleService roleService;

    @RequestMapping(value = "/getRoles", method = RequestMethod.GET)
    public List<Role> getRoles(){
        List<Role> roles = roleService.queryRoleList();
        ArrayList<Role> result = new ArrayList<>(roles);
        result.add(new Role("200", "角色200"));
        return result;
    }


}
