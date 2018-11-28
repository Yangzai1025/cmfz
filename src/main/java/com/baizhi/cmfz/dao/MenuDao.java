package com.baizhi.cmfz.dao;

import java.util.List;

public interface MenuDao {

    /**
     * 自连接查询一级菜单下的所有二级菜单
     *
     * @return
     */
    public List selectByInnerJoin();
}
