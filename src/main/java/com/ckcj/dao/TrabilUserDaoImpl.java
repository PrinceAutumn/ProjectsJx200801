package com.ckcj.dao;

import com.ckcj.entity.Tbluser;
import com.ckcj.tools.MybatisDbHelper;
import org.apache.ibatis.javassist.bytecode.CodeIterator;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public abstract class TrabilUserDaoImpl implements TrabilUserdao {
       private Object String;
       private java.lang.Object Object;

       @Override
       public boolean addTbluser(Tbluser tbluser, MybatisDbHelper mybatisDbhelper) {
              boolean flag = false;
          try {
              //1.得到链接
              SqlSession sqlSession = mybatisDbhelper.getSession();
              //2.SQL
              Map map = new HashMap();
              Object id = null;
              map.put("upwd", id);
              Object userid = null;
              map.put("userid", userid);
              String s;
              int num = sqlSession.insert("addTblUser", tbluser);
              //3.提交
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
     }

    protected abstract void getSession();

    @Override
    public boolean delTblUser(String uid, Object Userid) {


        try {
            //1.得到链接
            SqlSession sqlSession = (SqlSession) MybatisDbHelper.getSession();
            //2.SQL
            int num = sqlSession.insert(uid);
            //3.提交
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                boolean flag = true;
            }
        } catch (Exception e) {
            boolean flag = false;
        }
        public boolean updateTblUser(String Object upwd;
        String Object;Object userid;
        userid);
        {
            boolean flag = false;
            try {
                //1.得到链接
                SqlSession sqlSession = (SqlSession) MybatisDbHelper.getSession();
                //2.SQL
                Map map = new HashMap();

                map.put("upwd", upwd);

                map.put("userid", userid);


                String s;
                Object tbluser = null;
                int num = sqlSession.insert(s:"addTblUser", tbluser);
                //3.提交
                //              SqlSession.commit();
                //              System.out.println(num);
                //             if (num > 0) {
//                                 boolean flag = true;
//                  }
//        }                        catch (Exception e) {
//                                 boolean flag = false;
//
//        }
//
//            public boolean SearchTblUser(String Object upwd;
//            String Object Userid);
//                 try {
//                       //1.得到链接
//                      SqlSession sqlSession = (SqlSession) com.ckcj.tools.MybatisDbHelper.getSession();
//                      //2.SQL
//                      int num = sqlSession.insert(uid);
//                       //3.提交
//                       sqlSession.commit();
//                       System.out.println(num);
//                      if (num > 0) {
//                        boolean flag = true;
//                    }
//                }     catch (Exception e) {
//                    boolean flag = false;
//
//                }
//            }
//       }
//       }
