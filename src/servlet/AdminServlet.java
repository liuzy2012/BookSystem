package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.bookBiz;
import biz.impl.bookBizImpl;
import pojo.PageBean;
import pojo.book;

public class AdminServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		int currentPage;//获得当前页
		String current=(String) req.getParameter("page");
		if(current==null)
			currentPage=1;
		else
			currentPage=Integer.parseInt(current);
		//实例化业务层
		bookBiz bookbiz=new bookBizImpl();
		PageBean pb=new PageBean();
		pb.setTotalCount(bookbiz.getTotalCount());
		if(currentPage>0)
			pb.setCurrentPage(currentPage);
		//分页查询
		ArrayList<book> books=bookbiz.searchAllBook(pb);
		//获得总页数
		int pageCount=pb.getTotalPage();
		//将book集合和页面数跳转至admin.jsp页面
		req.setAttribute("bookslist", books);
		req.setAttribute("pagesize", pageCount);
		req.getRequestDispatcher("web/admin.jsp").forward(req, rep);
	}
}
