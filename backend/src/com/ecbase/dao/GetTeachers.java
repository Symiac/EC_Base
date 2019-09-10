package com.ecbase.dao;

import java.util.List;

import com.ecbase.bean.Teacher;

public interface GetTeachers {

	/**
	  *   获取所有教师基本信息：姓名，id,头像文件路径
	 * @return
	 */
	public List<Teacher> getAllTeachers();
	
	/**
	 * select teacher by id
	 * @param id 教师工号
	 * @return
	 */
	public Teacher getTeacherById(String id);
}
