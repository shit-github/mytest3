package com.itheima.ssm.dao;




import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * @author Chan
 * @TODO
 * @date 2020/3/23 20:45
 */
public interface ItemsDao {

    /***
     * 查询所有
     * @return
     */
    List<Items> list();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
