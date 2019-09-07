package com.ecbase.bean;

import java.sql.Date;

public class ExpAward {

	private int id;
	private String student_id;
	private Date time;
	private String name;
	private String level;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "ExpAward [id=" + id + ", student_id=" + student_id + ", time=" + time + ", name=" + name + ", level="
				+ level + "]";
	}
	
}
