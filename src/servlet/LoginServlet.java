package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.AdminBiz;
import biz.impl.AdminBizImpl;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adname=request.getParameter("adname");
		String adpassword=request.getParameter("password");
		//实例化Biz接口
		AdminBiz adminBiz=new AdminBizImpl();
		Boolean result=adminBiz.adminLogin(adname, adpassword);
		PrintWriter pWriter=response.getWriter();
		if(result==true)
			pWriter.println("<h2>Login Success!</h2>");
		else
			pWriter.println("<h2>Login Error!</h2>");
	}
}
