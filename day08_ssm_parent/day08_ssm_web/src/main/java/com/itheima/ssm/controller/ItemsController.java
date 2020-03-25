package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.dao.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Chan
 * @TODO
 * @date 2020/3/23 22:04
 */

@Controller
@RequestMapping(value = "/items")
public class ItemsController {


    @Autowired
    private ItemsService itemsService;


    /*****
     * 列表访问
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.list();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping(value = "/save")
    public String save(Items items){
        int acount =  itemsService.save(items);
        //集合列表页跳转
        return "redirect:/items/list";
    }

}
