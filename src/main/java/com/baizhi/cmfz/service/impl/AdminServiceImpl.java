package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.AdminDao;
import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    /**
     * 登录操作
     *
     * @param admin
     * @return
     */
    @Override
    public Admin login(Admin admin) {

        //调用业务类查询制定数据的方法
        Admin admins = adminDao.selectOne(admin);

        return admins;

    }

    /**
     * 注册
     *
     * @param admin
     */
    @Override
    public void register(Admin admin) {

    }
}
