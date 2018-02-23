package com.alimshare.entity;

import java.sql.Date;
import java.util.List;

import com.alimshare.util.NotificationStatus;

public class Email {
	
	String from;
	String to;
	String message;
	List<String> attachment;
	Date datetime;
	NotificationStatus status;
	
	public Email() {}
	
	public Email(String emailTo, String message) {
		this.to = emailTo;
		this.message = message;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<String> attachment) {
		this.attachment = attachment;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public NotificationStatus getStatus() {
		return status;
	}

	public void setStatus(NotificationStatus status) {
		this.status = status;
	}

}
