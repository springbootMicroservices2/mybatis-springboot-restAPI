package com.example.mybatis3.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis3.demo.domain.Tutor;
import com.example.mybatis3.demo.service.TutorService;

@RestController
public class TutorController {
	
@Autowired
private TutorService tutorService;

@GetMapping("/tutor/{id}")
public Tutor getTutor(@PathVariable("id")  Integer id) {
    return tutorService.selectTutorWithCoursesById(id);
}

}
