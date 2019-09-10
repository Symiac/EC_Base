package com.ecbase.service;

import java.io.IOException;
import java.io.InputStream;
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

import com.ecbase.bean.ExpProject;
import com.ecbase.bean.ExpWork;
import com.ecbase.bean.Student;

/**
 * Servlet implementation class ResStudent
 */
@WebServlet(urlPatterns={"/ResStudent","/yxxy/desc"})
//@WebServlet("/ResStudent")
public class ResStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append(request.getParameter("id"));
		response.setCharacterEncoding("utf-8");
		String date = this.getStudentById(request.getParameter("id"));
		response.getWriter().write(date);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public String getStudentById(String id) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);;
		SqlSession openSession = sqlSessionFactory.openSession();
		Student  stu = openSession.selectOne("getStudentById",id);
		ExpWork work = openSession.selectOne("getExpWorkById",id);
		ExpProject pro = openSession.selectOne("getProjectById",id);
		openSession.close();
		
		StringBuffer date = new StringBuffer();
		date.append("{\"status\":\"ok\",\"about\":{");
		date.append("\"name\":\""+stu.getName()+"\",");
		date.append("\"zhiye\":\""+work.getJob()+"\",");
		date.append("\"info\":\""+work.getDescription()+"\"},");
		date.append("\"info\":\""+work.getDescription()+"\"},");
		date.append("\"jingli\":[{");
		date.append("\"companyName\":\""+work.getCompany()+"\",");
		date.append("\"startTime\":\""+work.getBegin_time()+"\",");
		date.append("\"miaosu\":\""+work.getDescription()+"\"}],");
		date.append("\"contact\":{");
		date.append("\"phone\":\""+stu.getTel()+"\",");
		date.append("\"qq\":\""+stu.getQq()+"\",");
		date.append("\"weixin\":\""+stu.getWechat()+"\",");
		date.append("\"mail\":\""+stu.getEmail()+"\",");
		date.append("\"git\":\""+"\",");
		date.append("\"telpgone\":\""+stu.getTel()+"\"},");
		date.append("\"project\":[{");
		date.append("\"name\":\""+pro.getName()+"\",");
		date.append("\"pUrl\":\"127.0.0.1\",");
		date.append("\"pImg\":\""+stu.getPhoto()+"\"}]}");
		return date.toString();
	}

}
