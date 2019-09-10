package com.ecbase.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ecbase.bean.ExpProject;
import com.ecbase.bean.ExpWork;
import com.ecbase.bean.Student;
import com.ecbase.bean.Teacher;

/**
 * Servlet implementation class ResTeacher
 */

@WebServlet(urlPatterns={"/ResTeacher","/teacher/desc"})
//@WebServlet("/ResTeacher")
public class ResTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("(person)Information of Teachers");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		String date = this.getTeacherById(request.getParameter("id"));
		response.getWriter().write(date);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public String getTeacherById(String id) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);;
		SqlSession openSession = sqlSessionFactory.openSession();
		Teacher  teacher = openSession.selectOne("getTeacherById",id);
		openSession.close();
		
		StringBuffer date = new StringBuffer();
		date.append("{\"status\":\"ok\",\"name\":\""+teacher.getName()+"\"}");

		return date.toString();
	}

}
