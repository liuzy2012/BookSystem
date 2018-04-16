package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.AdminBiz;
import biz.impl.AdminBizImpl;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adname=request.getParameter("adname");
		String adpassword=request.getParameter("password");
		//实例化Biz接口
		AdminBiz adminBiz=new AdminBizImpl();
		Boolean result=adminBiz.adminLogin(adname, adpassword);
		response.setContentType("text/html;charset=UTF-8");
		if(result==true) {
			//request.getRequestDispatcher("adminServlet").forward(request, response);
			HttpSession session=request.getSession();
			session.setAttribute("logined", "logd");
			response.sendRedirect("adminServlet");
		}
		else {
			/*
			 * 如果账号密码错误将会重新跳转至登录页登录
			 * */
			PrintWriter out=response.getWriter();
			out.print("<script>alert('账号或密码错误！');window.location.href='web/admin/AdminLogin.jsp'</script>");
			//request.getRequestDispatcher("web/admin/AdminLogin.jsp").forward(request, response);
		}
	}
}
