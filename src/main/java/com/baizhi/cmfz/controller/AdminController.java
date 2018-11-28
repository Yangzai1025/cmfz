package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;


    //登录
    @RequestMapping("/login")
    public String login(HttpSession session, Admin admin, String kaptcha) {

        String sessionKaptcha = (String) session.getAttribute("kaptcha");

        /*System.out.println(sessionKaptcha);
        System.out.println(kaptcha);
        System.out.println(sessionKaptcha.equalsIgnoreCase(kaptcha));
        System.out.println(admin);*/

        if (sessionKaptcha.equalsIgnoreCase(kaptcha)) {
            Admin admins = adminService.login(admin);
            if (admins != null) {
                //验证通过登录成功将当前用户放入session作用域
                session.setAttribute("admin", admins);
                return "redirect:/main/main.jsp";
            } else {
                //验证不通过登录不成功
                return "login";
            }

        } else {
            //map.put("errorMessage", "验证码不正确，请确认！");
            return "login";
        }
    }

    //退出系统
    @RequestMapping("/quit")
    public String quit(HttpSession session) {

        //清楚session作用域中的用户信息
        session.removeAttribute("admin");
        //返回一个字符串后跳转到登录界面
        return "login";
    }

}
