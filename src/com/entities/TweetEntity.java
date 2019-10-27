package com.entities;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "tweets")
public class TweetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tweetID;
	
	@Column
	private String tweetBody;
	
	@Column
	private Date timestamp;
	
	public int getTweetID() {
		return tweetID;
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
