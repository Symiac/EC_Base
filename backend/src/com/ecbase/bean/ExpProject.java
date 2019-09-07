package com.ecbase.bean;

import java.sql.Date;

public class ExpProject {

	private int id;
	private String user_id;
	private Date begin_time;
	private Date end_time;
	private String name;
	private String source;
	private String description;
	private String myduty;
	private boolean is_leader;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMyduty() {
		return myduty;
	}
	public void setMyduty(String myduty) {
		this.myduty = myduty;
	}
	public boolean isIs_leader() {
		return is_leader;
	}
	public void setIs_leader(boolean is_leader) {
		this.is_leader = is_leader;
	}
	@Override
	public String toString() {
		return "ExpProject [id=" + id + ", user_id=" + user_id + ", begin_time=" + begin_time + ", end_time=" + end_time
				+ ", name=" + name + ", source=" + source + ", description=" + description + ", myduty=" + myduty
				+ ", is_leader=" + is_leader + "]";
	}
	
}
