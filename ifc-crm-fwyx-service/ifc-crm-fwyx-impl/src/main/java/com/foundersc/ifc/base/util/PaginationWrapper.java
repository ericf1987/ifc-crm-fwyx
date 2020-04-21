package com.foundersc.ifc.base.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author fengye
 * @Date 2020/4/21
 * @Time 13:57
 * @Desc
 */
@FunctionalInterface
public interface PaginationWrapper<T> {

    /**
     * 分页查询
     *
     * @param pageNum  当前页
     * @param pageSize 每页记录数
     * @return 查询结果
     */
    default List<T> doPagination(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        List<T> result = queryList();

        return new PageInfo<>(result).getList();
    }

    /**
     * 需要定义的mybatis查询
     *
     * @return 查询结果
     */
    List<T> queryList();

}
