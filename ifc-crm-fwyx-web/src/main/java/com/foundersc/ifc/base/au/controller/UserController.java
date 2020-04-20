package com.foundersc.ifc.base.au.controller;

import com.foundersc.ifc.base.au.model.UserPO;
import com.foundersc.ifc.base.au.service.IUserService;
import com.foundersc.ifc.crm.tools.common.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "用户")
public class UserController {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public Response getUserList(){
        List<UserPO> userList = userService.getUserList();
        return Response.success().data(userList);
    }

}
