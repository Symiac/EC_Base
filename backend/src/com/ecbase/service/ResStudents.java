package com.ecbase.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ecbase.bean.Student;
import com.ecbase.bean.Teacher;
import com.ecbase.service.ResTeachers.TeacherInfo;

/**
 * Servlet implementation class ResStudents
 */
@WebServlet(urlPatterns= {"/ResStudents","/yxxy/list"})
//@WebServlet("/ResStudents")
public class ResStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("(List)Information of SchoolMates");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		String date = this.getStudentsList();
		response.getWriter().write(date);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public List<Student> getAllStudents() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);;
		SqlSession openSession = sqlSessionFactory.openSession();
		List<Student>  list = openSession.selectList("getAllStudents");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		openSession.close();
		return list;
	}
	
	public String getStudentsList() throws IOException {
		
		List<Student>  list = this.getAllStudents();
		List<StudentInfo> returnList = new ArrayList();
		for(int i=0;i<list.size();i++) {
			String id = list.get(i).getId();
			String name = list.get(i).getName();
			String photo = list.get(i).getPhoto();
			returnList.add(new StudentInfo(id,name,photo));
		}
		StringBuffer date = new StringBuffer();
		date.append("{\"status\":\"ok\",\"teacher\":[");
		for(int i=0;i<returnList.size();i++) {
			date.append("{\"name\":\""+returnList.get(i).name);
			date.append("\",\"s_id\":\""+returnList.get(i).id);
			date.append("\",\"avatorUrl\":\""+returnList.get(i).photo+"\"},");
//			System.out.println(returnList.get(i));
		}
		date.append("]}");
		return date.toString();
//		System.out.println(date.toString());
		
	}
	
	class StudentInfo{
		String id;
		String name;
		String photo;
		StudentInfo(){}
		StudentInfo(String id,String name,String photo){
			this.id = id;
			this.name = name;
			this.photo = photo;
		}
		@Override
		public String toString() {
			return "StudentInfo [id=" + id + ", name=" + name + ", photo=" + photo + "]";
		}
		
	}
}
