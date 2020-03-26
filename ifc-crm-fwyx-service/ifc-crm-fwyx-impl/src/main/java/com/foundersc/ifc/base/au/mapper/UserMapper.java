package com.foundersc.ifc.base.au.mapper;

import com.foundersc.ifc.base.au.model.UserPO;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/3/24
 * @Time 14:18
 * @Desc
 */
public interface UserMapper {

    /**
     * 用户信息接口
     *
     * @return
     */
    List<UserPO> getUserList();

}
