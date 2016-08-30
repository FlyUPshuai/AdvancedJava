package com.willnot.struts2.helloworld;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class filterDispatcher
 */
@WebFilter("*.action")
public class filterDispatcher implements Filter {

 

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() { }

 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		String servletPath=req.getServletPath();
		//获取servletPath
		String path =null;
		//根据请求地址转发详情页面
		if(servletPath.equals("/product-input.action")){
			System.out.println("--input");
			path="/WEB-INF/pages/input.jsp";
		}else if(servletPath.equals("/product-save.action")){
			System.out.println("--save");
			HashMap<String, String> map=new HashMap<>();
			map.put("ProductName", request.getParameter("ProductName"));
			map.put("ProductDoc", request.getParameter("ProductDoc"));
			map.put("ProdoctPrice", request.getParameter("ProdoctPrice"));
			request.setAttribute("product", map);
			path="/WEB-INF/pages/detais.jsp";
		}
		
		if (path!=null) {
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
