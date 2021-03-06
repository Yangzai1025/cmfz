﻿<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>持名法州主页</title>
    <link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../themes/IconExtension.css">
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        <!--菜单处理-->
        $(function () {
            //alert("进入到初始化完后的函数");
            $.ajax({
                dataType: "json",
                url: "${pageContext.request.contextPath}/selectOneTwo",
                type: "post",
                success: function (result) {
                    var menuList = result.menuList;
                    //alert(menuList)
                    /*$.each(menuList, function(i,obj){
                        $('#aa').accordion('add', {
                            title: obj.title,
                            content: obj.menuTwo.title,
                            selected: false
                        });
                    })*/

                    /*$.each(menuList, function(i,obj){
                        var menuListTwo = obj.menuList;
                        $.each(menuListTwo,function(s,objTwo){
                            $('#aa').accordion('add', {
                                title: obj.title,
                                content: objTwo.title,
                                content: objTwo.title,
                                selected: false
                            });
                        })
                    })*/

                    $.each(menuList, function (i, obj) {
                        //var titleOne = obj.title;
                        var menuListTwo = obj.menuList;
                        var twoCategory = '';
                        $.each(menuListTwo, function (s, objTwo) {
                            /*twoCategory += '<ul><a href="javaScript:void(0)"><img src="
                            ${pageContext.request.contextPath}/themes/icons/'+objTwo.iconCls+'.png"></src>'+objTwo.title+'</a></ul>'*/
                            twoCategory += '<ul><img src="${pageContext.request.contextPath}/themes/icons/' + objTwo.iconCls + '.png"></src>' + objTwo.title + '</ul>'
                        })
                        $('#aa').accordion('add', {
                            title: obj.title,
                            content: twoCategory,
                            iconCls: 'icon-' + obj.iconCls,
                            style: "overflow:auto;padding:10px;",
                            selected: false
                        });
                    })
                }
            });
        })

    </script>

</head>
<body class="easyui-layout">
<div data-options="region:'north',split:true" style="height:60px;background-color:  #5C160C">
    <div style="font-size: 24px;color: #FAF7F7;font-family: 楷体;font-weight: 900;width: 500px;float:left;padding-left: 20px;padding-top: 10px">
        持名法州后台管理系统
    </div>
    <div style="font-size: 16px;color: #FAF7F7;font-family: 楷体;width: 300px;float:right;padding-top:15px">
        欢迎您:${sessionScope.admin.name} &nbsp;<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改密码</a>&nbsp;&nbsp;<a
            href="${pageContext.request.contextPath}/quit" class="easyui-linkbutton" data-options="iconCls:'icon-01'">退出系统</a>
    </div>
</div>
<div data-options="region:'south',split:true" style="height: 40px;background: #5C160C">
    <div style="text-align: center;font-size:15px; color: #FAF7F7;font-family: 楷体">&copy;百知教育 htf@zparkhr.com.cn</div>
</div>

<div data-options="region:'west',title:'导航菜单',split:true" style="width:220px;">
    <div id="aa" class="easyui-accordion" data-options="fit:true">
        <%--<div title="Title2" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;"><ul id="ul"></ul></div>--%>
        <%--<a href="javaScript:void(0)"></a>--%>
    </div>
</div>
<div data-options="region:'center'">
    <div id="tt" class="easyui-tabs" data-options="fit:true,narrow:true,pill:true">
        <div title="主页" data-options="iconCls:'icon-neighbourhood',"
             style="background-image:url(image/shouye.jpg);background-repeat: no-repeat;background-size:100% 100%;"></div>
    </div>
</div>
</body>
</html>