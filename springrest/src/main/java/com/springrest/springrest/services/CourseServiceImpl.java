package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"ye to abhi java rest api ka basic hai yarr","isme sam jab aasan hai trust kro yarr"));
		list.add(new Course(1343,"sahi me easy hai na ? ","to create kro rest api using spring boot"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	
	@Override
	public Course getCourses(long courseId) {
		Course c=null;
		for(Course course:list) {
			
			if(course.getId()==courseId) {
				c=course;
				break;
			}
			
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	

}
