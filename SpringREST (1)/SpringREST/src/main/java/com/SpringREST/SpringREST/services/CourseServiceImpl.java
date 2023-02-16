package com.SpringREST.SpringREST.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringREST.SpringREST.entities.Course;
import com.SpringREST.SpringREST.controller.*;
import com.SpringREST.SpringREST.services.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
public CourseServiceImpl()
{
	list = new ArrayList<>();
	list.add(new Course(1348,"springboot course ","create restApi using spring boot "));
	list.add(new Course(1349,"corejava course","this course contains core-java basics"));
	
	
	
}
@Override
public List<Course> getCourses() {
	// TODO Auto-generated method stub
	return list;
}
@Override
public Course getCourse(long courseId) {
	// TODO Auto-generated method stub
	Course c = null;
	for (Course course:list)
	{
		if (course.getId()== courseId)
		{
			c = course;
			break;
		}
	}
	return c;
}
@Override
public Course addCourse(Course course) {
	// TODO Auto-generated method stub
	list.add(course);
	return course;
}
}



    

