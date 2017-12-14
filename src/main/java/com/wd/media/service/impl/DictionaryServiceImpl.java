package com.wd.media.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.Mongo;
import com.wd.media.model.Dictionary;
import com.wd.media.repository.DictionaryRepository;
import com.wd.media.service.DictionaryService;

@Service
public class DictionaryServiceImpl  implements DictionaryService{


	@Autowired
	private DictionaryRepository dictionaryRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void saveDictionary(Dictionary dictionary) {
		dictionaryRepository.save(dictionary);
		
	}

	public List<Dictionary> findByKeyword(String keyword) {
		return dictionaryRepository.findByKeyword(keyword);
	}

	@Override
	public List<Dictionary> listDics() {
		return mongoTemplate.findAll(Dictionary.class);
	}

}
