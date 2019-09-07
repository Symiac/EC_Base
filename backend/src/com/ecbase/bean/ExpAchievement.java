package com.ecbase.bean;

public class ExpAchievement {

	private int id;
	private String user_id;
	private String reference;
	private String project_id;
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
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	@Override
	public String toString() {
		return "ExpAchievement [id=" + id + ", user_id=" + user_id + ", reference=" + reference + ", project_id="
				+ project_id + "]";
	}
	
}
