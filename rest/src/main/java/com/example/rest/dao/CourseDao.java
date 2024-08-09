package com.example.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
