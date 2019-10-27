package com.gui.models;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "tweet")
public class Tweet implements Serializable {
	private static final long serialVersionUID = 1L;
	private int tweetID;
	
	private String tweetBody;
	
	private Date timestamp;
	
	public int getTweetID() {
		return tweetID;
	}
	
	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}
	
	public String getTweetBody() {
		return tweetBody;
	}
	
	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
