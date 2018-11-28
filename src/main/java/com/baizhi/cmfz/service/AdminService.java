package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Admin;

public interface AdminService {

    /**
     * 登录操作 查询制定数据
     *
     * @param admin
     * @return
     */
    public Admin login(Admin admin);

    /**
     * 注册添加数据
     *
     * @param admin
     */
    public void register(Admin admin);
}
