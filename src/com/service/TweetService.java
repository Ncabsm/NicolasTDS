package com.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.entities.TweetEntity;
import com.service.TweetService;

@Stateless
public interface TweetService {
	public List<TweetEntity> getTweets();
	
	public void postTweet(TweetEntity tweetEntity);
}
