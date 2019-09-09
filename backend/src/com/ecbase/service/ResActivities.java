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

import com.ecbase.bean.Activity;
import com.ecbase.bean.Student;
import com.ecbase.service.ResStudents.StudentInfo;

/**
 * Servlet implementation class ResActivities
 */
@WebServlet("/ResActivities")
public class ResActivities extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResActivities() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("(List)Information of Activities");
		response.setCharacterEncoding("utf-8");
//		response.setContentType("application/json;charset=utf-8");
		String date = this.getActivitiesList();
		response.getWriter().write(date);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public List<Activity> getAllActivities() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);;
		SqlSession openSession = sqlSessionFactory.openSession();
		List<Activity>  list = openSession.selectList("getAllActivities");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		openSession.close();
		return list;
	}
	
	public String getActivitiesList() throws IOException {
		
		List<Activity>  list = this.getAllActivities();
		List<ActivityInfo> returnList = new ArrayList();
		for(int i=0;i<list.size();i++) {
			int id = list.get(i).getId();
			String title = list.get(i).getTitle();
			String content = list.get(i).getContent();
			returnList.add(new ActivityInfo(id,title,content));
		}
		StringBuffer date = new StringBuffer();
		date.append("{\"status\":\"ok\",\"teacher\":[");
		for(int i=0;i<returnList.size();i++) {
			date.append("{\"title\":\""+returnList.get(i).title);
			date.append("\",\"short_desc\":\""+returnList.get(i).content);
			date.append("\",\"b_id\":\""+returnList.get(i).id+"\"},");
//			System.out.println(returnList.get(i));
		}
		date.append("]}");
		return date.toString();
//		System.out.println(date.toString());
		
	}
	
	class ActivityInfo{
		int id;
		String title;
		String content;
		ActivityInfo(){}
		ActivityInfo(int id,String title,String content){
			this.id = id;
			this.title = title;
			this.content = content;
		}
		@Override
		public String toString() {
			return "ActivityInfo [id=" + id + ", title=" + title + ", content=" + content + "]";
		}
		
	}
}
