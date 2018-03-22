package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.AdminDao;
import utils.myDB;

public class AdminDaoImpl implements AdminDao{
	public boolean adminLogin(String admin, String password) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		Boolean result=false;
		try {
			//获取连接
			conn=myDB.getConnection();
			//编写SQL语句
			String adminLoginSql="select * from aduser where adname='"+admin+"' and password='"+password+"'";
			//创建语句执行者
			st=conn.prepareStatement(adminLoginSql);
			//获取结果
			rs=st.executeQuery();
			if(rs.next())
				result=true;
			else
				result=false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			myDB.closeResource(conn, st, rs);
			
		}
		
		// TODO Auto-generated method stub
		return result;
	}
}
