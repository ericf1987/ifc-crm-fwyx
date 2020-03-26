package com.foundersc.ifc.base.au.controller;

import com.foundersc.ifc.base.au.model.UserPO;
import com.foundersc.ifc.base.au.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/24
 * @Time 16:27
 * @Desc
 */
@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String getUserList(){
        List<UserPO> userList = userService.getUserList();
        return userList.toString();
    }

}
