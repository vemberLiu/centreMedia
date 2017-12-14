package com.wd.media.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wd.media.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	User findByName(String name);
}
