package com.ckcj.tools;

import com.ckcj.dao.TrabilUserDaoImpl;
import com.ckcj.dao.TrabilUserdao;
import com.ckcj.entity.Tbluser;
import org.junit.jupiter.api.Test;

public class TestTraibilUserDao<TblUserDao> {
    TblUserDao tbluserdao=new TblUserDaoImpl();
//测试方法定义：voie 方法名test前端
     @Test
      public void testDelTblUser(){
         Object uid;
         TrabilUserDaoImpl tblUserDao;
         boolean f = tblUserDao.delTblUser(uid:"2");
         System.out.println(f);
    }
       @Test
       public void testAddTblUser(){
         Tbluser tbluser=new Tbluser();
         tbluser.setPhone("23456789");
         tbluser.setMoney(300);
         tbluser.setUname（"CCQ");
         tbluser.getRid(1);
           Object tblUserDao;
           boolean f = tblUserDao.addTblUser(tbluser);
    }
    @Test
    public void testUpdateTblUser(){
        TrabilUserdao tblUserDao;
        String upwd;
        boolean f= tblUserDao.updateTblUser(upwd:Object userid;"123456",userid:"1");
        System.out.print(f);
    }

    private class TblUserDaoImpl extends TblUserDao {
    }
}
