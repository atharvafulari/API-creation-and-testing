package com.example.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.rest.entity.Course;
import com.example.rest.service.CourseServiceImp;

@RestController
public class MyController {
	@Autowired
	private CourseServiceImp cs;
	
	@GetMapping("/course")
	public List<Course> getCourses()
	{
		return this.cs.getCourse();
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.cs.addCourse(course);
	}
	
	@PutMapping("/course/{courseId}")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.cs.updateCourse(course);
	}
	
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus>deleteCourse
	(@PathVariable String courseId)

	{
		try
		{
			this.cs.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e)
		{
			return new ResponseEntity<>
			(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
