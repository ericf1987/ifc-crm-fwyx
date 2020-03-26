package com.foundersc.ifc.base.au.impl;

import com.foundersc.ifc.base.au.mapper.UserMapper;
import com.foundersc.ifc.base.au.model.UserPO;
import com.foundersc.ifc.base.au.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/24
 * @Time 14:17
 * @Desc
 */
@Service
@Slf4j
public class UserService implements IUserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserPO> getUserList() {

        List<UserPO> userList = userMapper.getUserList();

        log.info("用户信息 -> {}", userList.toString());

        return userList;
    }
}
