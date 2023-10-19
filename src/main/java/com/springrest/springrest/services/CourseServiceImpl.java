package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//	  list = new ArrayList<>();
//	  list.add(new Course(145,"Java Core Course","this course contains basics of java"));
//	  list.add(new Course(4343,"spring boot course","creating rest api using spring boot"));
	  
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
//		Course c = null;
//		
//		for (Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		
//		this.list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		this.list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
	//Optional<Course> entity = courseDao.findById(courseId);
	courseDao.deleteById(courseId);
	
	}

}
