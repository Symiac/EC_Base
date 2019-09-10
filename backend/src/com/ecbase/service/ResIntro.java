package com.ecbase.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResIntro
 */
@WebServlet(urlPatterns={"/ResIntro","/aboutecbase"})
//@WebServlet("/ResIntro")
public class ResIntro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResIntro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().append("Introduction of EC-Base");
        String date = "{\"shortcut\":\"本专业拥有一支学术水平一流、教学经验丰富的教师队伍和先进完备的实验设备，依托管理科学与工程一级学科的学科建设，使专业实验室的规模和水平跻身国内大学同类专业先进行列。\""
        		+ ",\"fulltext\":\"本专业高度重视学生创新能力的培养，强调商务与技术的融合、理论与实践的结合，突出信息技术、网络技术、商务智能在电子商务中的地位和作用。本专业围绕电子商务核心价值链，打造“四流（信息流、商流、资金流、物流）合一”的完整课程体系，并不断跟踪电子商务发展前沿优化课程内容，通过“重基础、宽视野、多渠道”的人才培养模式，在培养学生发现问题、分析问题、解决问题能力的基础上，重点培养电子商务系统设计、电子商务平台开发、电子商务管理与运营、商务模式创新、电商大数据分析与应用等专业能力\"}";
        response.getWriter().write(date);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
