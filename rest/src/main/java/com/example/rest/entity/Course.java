package com.example.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.*;
import jakarta.persistence.Table;

@Entity
@Table(name="Cust7")
public class Course 
{
	 @Id
	private long Id;
	private String title;
	public Course(long id, String title) {
		super();
		Id = id;
		this.title = title;
	}
	public Course() {
		super();
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", title=" + title + "]";
	}
	
	
	
}
