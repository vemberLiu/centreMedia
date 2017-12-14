package com.wd.media.service;

import org.springframework.stereotype.Service;

import com.wd.media.model.User;


public interface UserService {
	void save(User user);
    User findByName(String name);
}
