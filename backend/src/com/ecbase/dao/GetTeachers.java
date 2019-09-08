package com.ecbase.dao;

import java.util.List;

import com.ecbase.bean.Teacher;

public interface GetTeachers {

	/**
	 * ��ѯ������ʦ��Ϣ
	 * @return
	 */
	public List<Teacher> getAllTeachers();
	
	/**
	 * select teacher by id
	 * @param id ����ʦְ����
	 * @return
	 */
	public Teacher getTeacherById(String id);
}
