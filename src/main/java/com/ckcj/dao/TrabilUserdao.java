package com.ckcj.dao;

import com.ckcj.entity.Tbluser;
import com.ckcj.tools.MybatisDbHelper;

import java.util.List;


public interface TrabilUserdao<upwd> {
    //1.增加用户
    public boolean addTbluser(Tbluser tbluser);

    <MybatisDbHelper> boolean addTbluser(Tbluser tbluser, MybatisDbHelper mybatisDbhelper);
    //2.批量增加
    boolean addTbluser(Tbluser tbluser, MybatisDbHelper mybatisDbhelper);

    //3.删除用户
    public boolean delTblUser(String uid, Object Userid);
    //4.重置用户密码
    public boolean udpateTblUser();

    boolean delTblUser(String upwd, String userid);

    //5.传参用 注解param
    public boolean updateTblUser(
            String upwd, String userid);

    //6.查询所有用户列表 根据用户模糊查找分页
    public <Trabiluser> List findTrabiluser(String uname, int pageNo);

    //7.登录 根据用户密码查询
    public Tbluser loginUser (String uanme, String upwd);

    boolean addTblUer(Tbluser tbluser);
}
