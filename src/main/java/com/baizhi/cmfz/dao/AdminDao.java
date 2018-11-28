package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Admin;

public interface AdminDao {

    /**
     * 登录操作 查询制定数据
     *
     * @param admin
     * @return
     */
    public Admin selectOne(Admin admin);

    /**
     * 注册添加数据
     *
     * @param admin
     */
    public void insert(Admin admin);
}
