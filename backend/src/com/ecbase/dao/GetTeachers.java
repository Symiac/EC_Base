package com.ecbase.dao;

import java.util.List;

import com.ecbase.bean.Teacher;

public interface GetTeachers {

	/**
	 * 查询所有老师信息
	 * @return
	 */
	public List<Teacher> getAllTeachers();
	
	/**
	 * select teacher by id
	 * @param id ：教师职工号
	 * @return
	 */
	public Teacher getTeacherById(String id);
}
