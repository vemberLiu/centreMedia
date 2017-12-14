package com.wd.media.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.Mongo;
import com.wd.media.model.User;
import com.wd.media.repository.UserRepository;
import com.wd.media.service.UserService;

@Service
public class UserServiceImpl /*extends MongoTemplate*/ implements UserService{

	/*public UserServiceImpl(Mongo mongo, String databaseName) {
		super(mongo, databaseName);
	}*/

	@Autowired
    private UserRepository userRepository;

    public void save(User user) {
    	//this.save(user);
        userRepository.save(user);
    }

    public User findByName(String name) {
        return this.userRepository.findByName(name);
    }
	
}
