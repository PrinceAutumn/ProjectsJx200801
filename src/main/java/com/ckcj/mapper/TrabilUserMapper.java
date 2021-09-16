package com.ckcj.mapper;

import com.ckcj.entity.Tbluser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public interface TrabilUserMapper {
    //1.增加用户
    public int addTbluser(Tbluser tbluser);

    //2.批量增加
    public int addTbluser(List<Tbluser> tbluser);

    //3.删除用户
    public int delTbluser(String uid);

    //传参用 注解param
    public List<Tbluser> findTblUser(@Param(value = "uname") String uname,
                                     @Param(value = "miny") String miny,
                                     @Param(value = "maxy") String maxy,
                                     @Param(value = "pageNo") String pageNo
                                     );

    // 5.登录 根据用户和密码查询 @Param
    public Tbluser loginUser(@Param(value = "uname") String uname,
                             @Param(value = "upwd") String upwd);

    //6.批量删除
    public int deleMtbluser( List<String> uList);

    //7.关联查询
    public Tbluser  findUserRole(String userId);
}

