package com.foundersc.ifc.base.au.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author fengye
 * @Date 2020/3/24
 * @Time 14:16
 * @Desc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPO {

    private String userId;
    private String username;
    private String curState;

}
