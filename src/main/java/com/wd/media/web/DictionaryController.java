package com.wd.media.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wd.media.model.Dictionary;
import com.wd.media.service.DictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
	@Autowired
	private DictionaryService dictionaryService;
	
	@Autowired
    private MongoTemplate mongoTemplate;
	
	@GetMapping("/save")
	@ResponseBody
	public Dictionary save(){
		Dictionary dictionary = new Dictionary("1", "周恩来", "Red", "A");
		mongoTemplate.save(dictionary);
		//dictionaryService.saveDictionary(dictionary);
		return dictionary;
	}
	
	@GetMapping("/getDictionaries")
	@ResponseBody
	public List<Dictionary> list(){
		List<Dictionary> dicList = dictionaryService.listDics();
		return dicList;
	}
	@RequestMapping("/")
	public String dictionary(){
		return "dictionary";
	}
}
