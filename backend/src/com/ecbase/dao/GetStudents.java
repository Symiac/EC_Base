package com.ecbase.dao;

import java.util.List;

import com.ecbase.bean.Student;

public interface GetStudents {

	/**
	  *   获取所有教师基本信息：姓名，id,头像文件路径
	 * @return
	 */
	public List<Student> getAllStudents();
	
	/**
	 * select teacher by id
	 * @param id 教师工号
	 * @return
	 */
	public Student getStudentById(String id);
}
