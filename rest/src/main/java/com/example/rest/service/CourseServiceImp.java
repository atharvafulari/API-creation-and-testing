package com.example.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.dao.CourseDao;
import com.example.rest.entity.Course;

import jakarta.persistence.Entity;

@Service


public class CourseServiceImp implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourse()
	{
		return courseDao.findAll();
	}
	
	@Override
	public Course addCourse(Course course)
	{
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course)
	{
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long parselong)
	{
		Course Entity=courseDao.getOne(parselong);
		courseDao.delete(Entity);
	}
}
