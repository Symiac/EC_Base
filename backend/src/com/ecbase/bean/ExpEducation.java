package com.ecbase.bean;

import java.sql.Date;

public class ExpEducation {

	private int id;
	private String user_id;
	private Date begin_time;
	private Date end_time;
	private String college;
	private String major;
	private String degree;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "ExpEducation [id=" + id + ", user_id=" + user_id + ", begin_time=" + begin_time + ", end_time="
				+ end_time + ", college=" + college + ", major=" + major + ", degree=" + degree + "]";
	}
	
}
