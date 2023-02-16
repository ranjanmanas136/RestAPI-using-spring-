package com.SpringREST.SpringREST.services;
import com.SpringREST.SpringREST.controller.*;
import com.SpringREST.SpringREST.entities.Course;

import java.util.List;
public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	

}
