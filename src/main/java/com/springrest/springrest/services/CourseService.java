package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	List<Course> getCourses();
	Optional<Course> getCourse(long courseId);
	Course addCourse(Course course);
	Course updateCourse(Course course);
	void deleteCourse(long courseId);
}
