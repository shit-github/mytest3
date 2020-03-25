package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * @author Chan
 * @TODO
 * @date 2020/3/23 21:40
 */

public interface ItemsService {

    /***
     * 列表查询
     * @return
     */
    List<Items> list();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);
}