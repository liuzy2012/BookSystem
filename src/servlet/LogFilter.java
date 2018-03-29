package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogFilter implements Filter{
	private FilterConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * Filter的核心处理
	 * */
	@Override
	public void doFilter(ServletRequest req, ServletResponse rep, FilterChain filc)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) rep;
		HttpSession session=request.getSession();
		//如果session中有logined，则证明过滤成功
		if(session.getAttribute("logined")!=null) {
			filc.doFilter(req, rep);
		}
		else
			response.sendRedirect("web/AdminLogin.jsp");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config=config;
	}

}
