package oa.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JiuYe {

	private Integer id;
	private String title;
	private String content;
	private Assistant assistant;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Assistant getAssistant() {
		return assistant;
	}
	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}
	
}
