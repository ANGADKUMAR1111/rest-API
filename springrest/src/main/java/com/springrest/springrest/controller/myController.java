package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class myController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return"java hai yarr";
	}
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
		
	}
	
	//get the courses
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		
		return this.courseService.getCourses(Long.parseLong(courseId));
		
	}
	
	//post the courses
	@PostMapping(path ="/courses", consumes="application/json")
	public Course addCourse(@RequestBody Course course ) {
		
		return this.courseService.addCourse(course);
	}

}
