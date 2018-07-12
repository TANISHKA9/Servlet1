package com.try1;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Try extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		//System.out.println(num1);
		res.getWriter().println(num1);
	}
}
