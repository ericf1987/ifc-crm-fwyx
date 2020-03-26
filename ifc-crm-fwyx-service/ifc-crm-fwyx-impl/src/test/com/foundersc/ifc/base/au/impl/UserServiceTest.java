package com.foundersc.ifc.base.au.impl;

import com.foundersc.ifc.FwyxImplTest;
import com.foundersc.ifc.base.au.model.UserPO;
import com.foundersc.ifc.base.au.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/24
 * @Time 14:25
 * @Desc
 */
@Slf4j
public class UserServiceTest extends FwyxImplTest {

    @Autowired
    IUserService userService;

    @Test
    public void testGetUserList() throws Exception {
        List<UserPO> userList = userService.getUserList();
        log.info("用户信息：{}", userList.toString());
    }
}