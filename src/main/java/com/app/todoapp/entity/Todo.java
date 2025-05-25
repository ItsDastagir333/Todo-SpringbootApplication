package com.app.todoapp.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
    private String description;
    private LocalDate dateToComplete;
    private Boolean isComplete;

	
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateToComplete() {
		return dateToComplete;
	}
//	public void setDateToComplete(LocalDate localDate) {
//		this.dateToComplete = localDate;
//	}
	public Boolean getIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	public void setDateToComplete(LocalDate now) {
		// TODO Auto-generated method stub
		this.dateToComplete = now;
	}
	
    
    
}
	
