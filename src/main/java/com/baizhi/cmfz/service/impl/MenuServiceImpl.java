package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    /**
     * 查询一级菜单下的所有二级菜单
     *
     * @return
     */
    @Override
    public Map selectByInnerJoin() {

        //创建一个Map集合
        Map map = new HashMap();
        //调用dao层的查询数据的方法
        List menuList = menuDao.selectByInnerJoin();
        //将数据放入Map集合
        map.put("menuList", menuList);

        return map;
    }
}
