package biz.impl;

import biz.AdminBiz;
import dao.AdminDao;
import dao.impl.AdminDaoImpl;

public class AdminBizImpl implements AdminBiz{
	private AdminDao adminDao;
	public boolean adminLogin(String admin, String password) {
		//实例化接口
		adminDao=new AdminDaoImpl();
		pojo.admin admin2=new pojo.admin();
		admin2.setAdmin(admin);
		admin2.setPassword(password);
		Boolean result=adminDao.adminLogin(admin2.getAdmin(), admin2.getPassword());
		return result;
	}
}
