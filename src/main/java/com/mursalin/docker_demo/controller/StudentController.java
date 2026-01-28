package com.mursalin.docker_demo.controller;

import com.mursalin.docker_demo.model.Student;
import com.mursalin.docker_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/add-student")
    public ResponseEntity<String> addStudent() {
        return ResponseEntity.ok(studentService.addStudent());
    }

    @RequestMapping("/get-students")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
