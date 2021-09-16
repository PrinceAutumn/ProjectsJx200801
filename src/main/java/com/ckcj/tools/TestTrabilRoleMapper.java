package com.ckcj.tools;

import com.ckcj.entity.Tbluser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.awt.*;

public class TestTrabilRoleMapper<Sqlession, TblRoleMapper, Sqlsession, TblUserMapper> {
    org.apache.ibatis.session.SqlSession sqlsession=MybatisDbHelper.getSession();
    TblRoleMapper tblRoleMapper=sqlsession.(TblUserMapper.class);
    @Test
    public <Tblrole> void testFindRoleUsers(){
        Object rid = null;
        Tblrole tblrole= tblRoleMapper.findRoleUsers(rid"1");
        List tbluserList=tblrole.getTblusers();
        for (Tbluser tblUser:TbluserList){
        }
        Object tbluser;
        System.out.println(tbluser.getUname());
    }

    private class SqlSession {
    }
}