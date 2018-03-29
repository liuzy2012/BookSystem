package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.bookBiz;
import biz.impl.bookBizImpl;
import pojo.book;

public class BookServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		int bookid=Integer.parseInt(req.getParameter("bookid"));
		bookBiz bookbiz=new bookBizImpl();
		book bk=bookbiz.getBookById(bookid);
		if(req.getParameter("method")!=null&&req.getParameter("method").equals("update")) {
			int borrow=Integer.parseInt(req.getParameter("borrow"));
			String intro=req.getParameter("intro");
			if(bookbiz.editBook(bookid, intro, borrow)) {
				//req.setAttribute("bk", bk);
				//req.getRequestDispatcher("bookServlet?bookid="+bookid).forward(req, rep);
				PrintWriter out=rep.getWriter();
				out.println("success");
			}
		}
		else {
			//将获取到的book数据发送并跳转至book.jsp页面
			req.setAttribute("bk", bk);
			req.getRequestDispatcher("web/book.jsp?bookid="+bookid).forward(req, rep);
		}
	}
}
