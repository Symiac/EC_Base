package com.ecbase.bean;

public class Teacher {

	private String id;
	private String name;
	private int sex;
	private String nation;
	private String politics_status;
	private String photo;
	private String title;
	private String job;
	private String email;
	private String tel;
	private boolean is_ds;
	private boolean is_ms;
	private String reaserch_dir;
	private String department;
	private String self_introduction;
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getPolitics_status() {
		return politics_status;
	}
	public void setPolitics_status(String politics_status) {
		this.politics_status = politics_status;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isIs_ds() {
		return is_ds;
	}
	public void setIs_ds(boolean is_ds) {
		this.is_ds = is_ds;
	}
	public boolean isIs_ms() {
		return is_ms;
	}
	public void setIs_ms(boolean is_ms) {
		this.is_ms = is_ms;
	}
	public String getReaserch_dir() {
		return reaserch_dir;
	}
	public void setReaserch_dir(String reaserch_dir) {
		this.reaserch_dir = reaserch_dir;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSelf_introduction() {
		return self_introduction;
	}
	public void setSelf_introduction(String self_introduction) {
		this.self_introduction = self_introduction;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", nation=" + nation + ", politics_status="
				+ politics_status + ", photo=" + photo + ", title=" + title + ", job=" + job + ", email=" + email
				+ ", tel=" + tel + ", is_ds=" + is_ds + ", is_ms=" + is_ms + ", reaserch_dir=" + reaserch_dir
				+ ", department=" + department + ", self_introduction=" + self_introduction + ", status=" + status
				+ "]";
	}
	
}
