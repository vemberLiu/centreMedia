package com.wd.media.service;

import java.util.List;

import com.wd.media.model.Dictionary;

public interface DictionaryService {
	void saveDictionary(Dictionary dictionary);
	List<Dictionary> findByKeyword(String keyword);
	List<Dictionary> listDics();
}
