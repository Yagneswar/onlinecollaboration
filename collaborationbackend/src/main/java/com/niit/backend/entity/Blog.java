package com.niit.backend.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Blog {
	@Id
	private String id;
	private String title;
	private String content;
	@Column(name = "created_at")
	private Date createdAt;
	private String status;
	@Column(name = "user_id")
	private String userId;
	
	public Blog() {
		this.id = "BLG" + UUID.randomUUID().toString().substring(24).toUpperCase();				
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", content=" + content + ", createdAt=" + createdAt + ", status="
				+ status + ", userId=" + userId + "]";
	}
		
	
}
