package com.ckcj.tools;

import com.ckcj.entity.Tbluser;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

  public class TestTrabilUserMapper {
        public void testAddTbluser() {
            SqlSession sqlsession = MybatisDbHelper.getSession();
            TblUserMapper tblUserMapper = SqlSession.getMapper(TblUserMapper.class);
            Tbluser tbluserMapper = (Tbluser) sqlsession;
    }

    private class TblUserMapper {
    }
}
