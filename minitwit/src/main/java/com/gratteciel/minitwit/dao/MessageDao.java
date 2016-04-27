package com.gratteciel.minitwit.dao;

import java.util.List;

import com.gratteciel.minitwit.model.Message;
import com.gratteciel.minitwit.model.User;

public interface MessageDao {
	List<Message> getUserTimelineMessages(User user);
	
	List<Message> getUserFullTimelineMessages(User user);
	
	List<Message> getPublicTimelineMessages();
	
	void insertMessage(Message m);
}
