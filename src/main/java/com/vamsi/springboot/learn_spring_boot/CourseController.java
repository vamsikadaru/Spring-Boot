package com.vamsi.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "vamsi"),
				new Course(2, "Learn DevOps", "vamsi"),
				new Course(3, "Azure", "vamsi")
				);
	}
}
