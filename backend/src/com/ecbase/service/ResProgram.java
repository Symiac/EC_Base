package com.ecbase.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResProgram
 */
//@WebServlet("/ResProgram")
@WebServlet("/ResProgram")
public class ResProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResProgram() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		String s = "培养目标：本专业主要培养具备现代管理和信息经济理念、掌握信息技术和电子服务综合技能、具有扎实的专业基础和良好的知识结构，具备一定的互联网创新创业素质，能从事网络环境下商务运营、专业管理和技术服务的复合型、应用型、创新型专业人才y。\r\n" + 
				"\r\n" + 
				"专业特色：本专业高度重视学生创新能力的培养，强调商务与技术的融合、理论与实践的结合，突出信息技术、网络技术、商务智能在电子商务中的地位和作用。本专业围绕电子商务核心价值链，打造“四流（信息流、商流、资金流、物流）合一”的完整课程体系，并不断跟踪电子商务发展前沿优化课程内容，通过“重基础、宽视野、多渠道”的人才培养模式，在培养学生发现问题、分析问题、解决问题能力的基础上，重点培养电子商务系统设计、电子商务平台开发、电子商务管理与运营、商务模式创新、电商大数据分析与应用等专业能力。y\r\n" + 
				"\r\n" + 
				"本专业拥有一支学术水平一流、教学经验丰富的教师队伍和先进完备的实验设备，依托管理科学与工程一级学科的学科建设，使专业实验室的规模和水平跻身国内大学同类专业先进行列。y\r\n" + 
				"\r\n" + 
				"主要课程：电子商务经济学、运筹学、管理统计学、网络营销、网络金融与电子支付、电子商务网站设计、数据库原理、电子商务信息平台解决方案、商务模式创新、电子商务安全技术、移动商务与协同商务、电商APP开发、电子商务物流系统、商务智能方法与应用、跨境电子商务、电商大数据应用案例分析等。y\r\n" + 
				"\r\n" + 
				"   就业前景：本专业社会需求旺盛，就业方向多元化，毕业生主要在交通运输、信息技术、保险、金融、商业等领域从事与电子商务、信息管理、决策支持相关的运营管理、项目管理、电商系统开发与维护、营销策划、数据分析等工作。y";
		response.getWriter().append(s);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
