package com.wd.media.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wd.media.model.Dictionary;

public interface DictionaryRepository extends MongoRepository<Dictionary, String>{
	List<Dictionary> findByKeyword(String keyword);
}
