package com.wd.media.model;

import org.springframework.data.annotation.Id;

public class Dictionary {
	@Id
	private String id;
	private String type;
	private String keyword;
	private String colorGrade;
	private String ranking;
	
	
	public Dictionary(){
		super();
	}
	
	public Dictionary(String type, String keyword, String colorGrade, String ranking) {
		super();
		this.type = type;
		this.keyword = keyword;
		this.colorGrade = colorGrade;
		this.ranking = ranking;
	}
	public Dictionary(String id, String type, String keyword, String colorGrade, String ranking) {
		super();
		this.id = id;
		this.type = type;
		this.keyword = keyword;
		this.colorGrade = colorGrade;
		this.ranking = ranking;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getColorGrade() {
		return colorGrade;
	}
	public void setColorGrade(String colorGrade) {
		this.colorGrade = colorGrade;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {
		return "Dictionary [id=" + id + ", type=" + type + ", keyword=" + keyword + ", colorGrade=" + colorGrade
				+ ", ranking=" + ranking + "]";
	}
	
	
	
}
