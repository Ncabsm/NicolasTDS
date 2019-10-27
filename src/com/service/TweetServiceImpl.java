
package com.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.entities.TweetEntity;
import com.service.TweetService;

@Stateless
public class TweetServiceImpl implements TweetService {
	//@PersistenceContext
	private EntityManager tm = Persistence.createEntityManagerFactory("NicolasTDS").createEntityManager();
	
	public List<TweetEntity> getTweets() {
		List<TweetEntity> resultList = (List<TweetEntity>) tm.createQuery("from TweetEntity").getResultList();
		return resultList;
	}
	
	public void postTweet(TweetEntity tweetEntity) {
		tm.getTransaction().begin();
        tm.persist(tweetEntity);
        tm.getTransaction().commit();
	}
}
