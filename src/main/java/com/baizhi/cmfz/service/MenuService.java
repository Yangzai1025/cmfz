package com.baizhi.cmfz.service;


import java.util.Map;

public interface MenuService {

    /**
     * 自连接查询一级菜单下的所有二级菜单
     *
     * @return
     */
    public Map selectByInnerJoin();
}
