package com.baizhi.cmfz.entity;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    /*private String id;
    private String title;//标题
    private String iconCls;//图片
    private String parent_id;//父级id
    private String url;//图片对应的地址
    private Menu menuTwo;//二级分类下的数据

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Menu getMenuTwo() {
        return menuTwo;
    }

    public void setMenuTwo(Menu menuTwo) {
        this.menuTwo = menuTwo;
    }

    public Menu() {
        super();
    }

    public Menu(String id, String title, String iconCls, String parent_id, String url, Menu menuTwo) {
        this.id = id;
        this.title = title;
        this.iconCls = iconCls;
        this.parent_id = parent_id;
        this.url = url;
        this.menuTwo = menuTwo;
    }

    public Menu(String title, String iconCls, String parent_id, String url, Menu menuTwo) {
        this.title = title;
        this.iconCls = iconCls;
        this.parent_id = parent_id;
        this.url = url;
        this.menuTwo = menuTwo;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parent_id='" + parent_id + '\'' +
                ", url='" + url + '\'' +
                ", menuTwo=" + menuTwo +
                '}';
    }*/

    private String id;
    private String title;//标题
    private String iconCls;//图片
    private String parent_id;//父级id
    private String url;//图片对应的地址
    private List menuList;//二级分类下的数据

/*    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List getMenuList() {
        return menuList;
    }

    public void setMenuList(List menuList) {
        this.menuList = menuList;
    }*/

    public Menu() {
        super();
    }

    public Menu(String id, String title, String iconCls, String parent_id, String url, List menuList) {
        this.id = id;
        this.title = title;
        this.iconCls = iconCls;
        this.parent_id = parent_id;
        this.url = url;
        this.menuList = menuList;
    }

    public Menu(String title, String iconCls, String parent_id, String url, List menuList) {
        this.title = title;
        this.iconCls = iconCls;
        this.parent_id = parent_id;
        this.url = url;
        this.menuList = menuList;
    }

/*    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parent_id='" + parent_id + '\'' +
                ", url='" + url + '\'' +
                ", menuList=" + menuList +
                '}';
    }*/
}
