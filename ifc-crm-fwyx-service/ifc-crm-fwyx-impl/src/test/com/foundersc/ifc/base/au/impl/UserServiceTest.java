package com.foundersc.ifc.base.au.impl;

import com.foundersc.ifc.FwyxImplTest;
import com.foundersc.ifc.base.au.model.UserPO;
import com.foundersc.ifc.base.au.service.IUserService;
import com.foundersc.ifc.base.util.PaginationWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

//    @Autowired
//    PageHelper pageHelper;

    @Test
    public void testGetUserList() throws Exception {
        List<UserPO> userList = userService.getUserList();
        log.info("用户信息：{}", userList.toString());
    }

    @Test
    public void testUserListWithPagination() throws Exception{

//        log.info("MyBatis分页插件PageHelper -> {}", pageHelper);

        PageInfo<UserPO> pageInfo = PageHelper.startPage(1, 20).doSelectPageInfo(
                () -> userService.getUserList()
        );
        List<UserPO> userPOList = pageInfo.getList();
        log.info("查询结果：pageInfo -> {}", pageInfo);
        log.info("查询结果：userPOList -> {}", userPOList);
    }

    @Test
    public void testPagination2() throws Exception{
        PaginationWrapper<UserPO> pw = () -> userService.getUserList();
        List<UserPO> result = pw.doPagination(1, 20);
        log.info("查询结果：{}", result);
    }
}