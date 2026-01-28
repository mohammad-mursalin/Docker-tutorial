package com.mursalin.docker_demo.service;

import com.mursalin.docker_demo.model.Student;
import com.mursalin.docker_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent() {
        Student student = studentRepository.save(new Student("raju", 20));

        return "student is added";
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
