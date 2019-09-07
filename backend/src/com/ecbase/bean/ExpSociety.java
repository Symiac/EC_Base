package com.ecbase.bean;

import java.sql.Date;

public class ExpSociety {

	private int id;
	private String student_id;
	private String socity;
	private String post;
	private Date begin_time;
	private Date end_time;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getSocity() {
		return socity;
	}
	public void setSocity(String socity) {
		this.socity = socity;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ExpSociety [id=" + id + ", student_id=" + student_id + ", socity=" + socity + ", post=" + post
				+ ", begin_time=" + begin_time + ", end_time=" + end_time + ", description=" + description + "]";
	}
	
}
