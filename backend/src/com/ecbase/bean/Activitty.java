package com.ecbase.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Activitty {

	private int id;
	private String title;
	private String content;
	private String sponsor;
	private String photos;
	private Date begin_time;
	private Date end_time;
	private Timestamp upload_time;
	private String uploader;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
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
	public Timestamp getUpload_time() {
		return upload_time;
	}
	public void setUpload_time(Timestamp upload_time) {
		this.upload_time = upload_time;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	@Override
	public String toString() {
		return "Activitty [id=" + id + ", title=" + title + ", content=" + content + ", sponsor=" + sponsor
				+ ", photos=" + photos + ", begin_time=" + begin_time + ", end_time=" + end_time + ", upload_time="
				+ upload_time + ", uploader=" + uploader + "]";
	}
	
}
