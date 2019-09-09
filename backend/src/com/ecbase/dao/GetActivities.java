package com.ecbase.dao;

import java.util.List;

import com.ecbase.bean.Activity;

public interface GetActivities {
	/**
	  *   获取所有学生基本信息：姓名，id,头像文件路径
	 * @return
	 */
	public List<Activity> getAllActivities();
	
	/**
	 * select teacher by id
	 * @param id 教师工号
	 * @return
	 */
	public Activity getActivityById(int id);
}
