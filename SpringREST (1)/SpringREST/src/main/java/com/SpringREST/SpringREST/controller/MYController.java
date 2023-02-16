package com.SpringREST.SpringREST.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringREST.SpringREST.services.*;

import com.SpringREST.SpringREST.entities.Course;
@RestController
public class MYController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "This is my home page ";
	}
	//get the courses 
	@GetMapping ("/courses")
	public List<Course>getCourses()
	{
		return this.courseService.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	}

	
	


