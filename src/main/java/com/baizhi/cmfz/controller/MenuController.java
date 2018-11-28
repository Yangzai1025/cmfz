package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
//@RequestMapping("/main")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/selectOneTwo")
    public @ResponseBody
    Map selectOneTwo(HttpSession session) {

        //System.out.println("进入到菜单展示");
        //获取session作用域中的用户信息
        Admin admin = (Admin) session.getAttribute("admin");
        //判断是否有登录信息
        if (admin != null) {
            //有登录信息
            //调用业务类查询菜单数据的方法
            Map map = menuService.selectByInnerJoin();

            return map;
        } else {
            //无登录信息
            return null;
        }

    }

}
