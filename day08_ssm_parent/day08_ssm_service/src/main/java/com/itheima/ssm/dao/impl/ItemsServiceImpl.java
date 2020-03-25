package com.itheima.ssm.dao.impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.dao.ItemsService;
import com.itheima.ssm.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chan
 * @TODO
 * @date 2020/3/23 21:42
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    /**
     * 集合查询
     * @return
     */
    public List<Items> list() {
        return itemsDao.list();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}
